package com.mg.img.utils;

import jxl.Cell;
import jxl.CellView;
import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.write.*;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auth CarlLing
 * @Date 2019/8/26 9:34
 * @Version 1.0
 * @Desc 检查execl中图片文件类型是否存在文件夹类型数
 *
 * jxl操作Excel包括对象Workbook（工作簿），Sheet（工作表） ，Cell（单元格）。
 * 一个Excel就对应一Workbook对象，一个Workbook可以有多个Sheet对象，一个Sheet对象可以有多个Cell对象。
 */
@Slf4j
public class ReadWriteExecl {


    /**
     * 使用jxl.jar工具类库实现读取Excel中指定列的数据。
     * 读取excel表格中特定的列
     *
     * @param file  文件
     * @param index 第index列（0开始）
     */
    public static ArrayList<String> readColumn(File file, int index) throws Exception {
        ArrayList<String> typeList = new ArrayList<>();

        InputStream inputStream = new FileInputStream(file.getAbsoluteFile());
        //1.新建并获取工作薄：
        Workbook workbook = Workbook.getWorkbook(inputStream);
        //2.读取工作表：
        Sheet sheet = workbook.getSheet(0); //index从0开始，0对应Sheet1
        int rows = sheet.getRows();
        int columns = sheet.getColumns(); //获取该sheet 有几列
        System.out.println("-------------execl 中共有 " + columns + " 列----------");
        for (int i = 1; i < rows; i++) {
            //3.获取单元格：
            Cell cell = sheet.getCell(index, i);
            typeList.add("" + cell.getContents());
            //4.读取单元格内容：
            //System.out.println(cell.getContents());
        }

      /*  int num = 1;
        int sum = 0;
        for (String filename : typeList) {
            System.out.println(filename);
            sum = num++;
        }
        System.out.println(sum);*/
        return typeList;
    }


    /**
     * 使用jxl.jar工具类库将数据按列写入Excel并设置格式
     * 按列写入Excel并设置格式
     *
     * @param outputUrl   输出路径
     * @param sheetName   工作薄名称
     * @param titlesArray 表头
     * @param arrayList   表头数据
     *
     */
    public static void writeExcel(String outputUrl, String sheetName, String[] titlesArray,
                                  List<String>... arrayList) throws IOException, WriteException {
        if (outputUrl == null || outputUrl.length() == 0) {
            System.out.println(
                    "Param(s) Error:outputUrl is required and the length of outputUrl is required greater than 0.");
            return;
        }
        int n = arrayList.length;
        if (titlesArray.length != n) {
            System.out.println("Param(s) Error:the titles' length is hoped to be equal to arrayList's length.");
            return;
        }
        //创建Excel文件
        File file = new File(outputUrl);
        file.createNewFile();
        //创建工作簿
        WritableWorkbook workbook = Workbook.createWorkbook(file);
        //创建sheet，设置名称为sheetName，默认Sheet1
        if (null == sheetName || sheetName.length() == 0) {
            sheetName = "Sheet1";
        }
        WritableSheet sheet = workbook.createSheet(sheetName, 0);
        //设置titles
        String[] titles = titlesArray;
        //设置表头：列名和各种格式
        for (int i = 0; i < titles.length; i++) {
            WritableFont font = new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD);
            CellView cellView = new CellView();
            //cellView.setAutosize(true); //设置自动大小
            //cellView.setSize();
            sheet.setColumnView(i, cellView); //根据内容自动设置列宽
            WritableCellFormat format = new WritableCellFormat(font);
            format.setAlignment(Alignment.CENTRE); //居中对齐
            format.setBackground(Colour.YELLOW); //背景色
            format.setBorder(Border.ALL, BorderLineStyle.THICK, Colour.BLACK);//边框
            Label label = new Label(i, 0, titles[i], format);
            sheet.addCell(label);
        }
        //写入数据，并设置一些格式
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arrayList[i].size(); j++) {
                //WritableFont.createFont("宋体")：设置字体为宋体
                //10：设置字体大小
                //WritableFont.BOLD:设置字体加粗（BOLD：加粗 NO_BOLD：不加粗）
                //false：设置非斜体
                //UnderlineStyle.NO_UNDERLINE：没有下划线
                WritableFont font = new WritableFont(WritableFont.createFont("宋体"), 10, WritableFont.NO_BOLD);
                WritableCellFormat format = new WritableCellFormat(font);
                Label label = new Label(i, j + 1, arrayList[i].get(j), format);
                sheet.addCell(label);
            }
        }
        //写入数据
        workbook.write();
        //关闭工作簿
        workbook.close();
    }
}
