package com.mg.rname.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auth CarlLing
 * @Date 2019/8/19 13:21
 * @Version 1.0
 * @Desc 列出某目录下的所有目录和图片
 */
public class FindFileAllUtil {

    public static void main(String args[]) {
        String dirname = "F:/rename_image/image600/image";
        //queryFileName(dirname);
        findFileDirName(dirname);
    }

    /**
     * 递归查看文件夹下目录和文件，以及目录下的目录和文件
     *
     * @param dirname
     */
    public static void queryFileName(String dirname) {
        File f1 = new File(dirname);
        if (!f1.getName().equals("image") && !f1.getName().equals("主图")) {
            System.out.println("------>" + f1.getName());
        }
        if (f1.isDirectory()) {
            System.out.println("*********************************");
            System.out.println("--> " + dirname);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                String filename = dirname + "/" + s[i];
                File f = new File(filename);

                if (f.isDirectory()) {
                    System.out.println("目录：" + s[i]);
                    queryFileName(filename);


                } else {
                    System.out.println("文件：" + s[i]);

                }
            }
        } else {
            System.out.println(dirname + " is not a directory");
        }

/*        int num = 1;
        int sum = 0;
        for (String filename: dirNames){
            System.out.println(filename );
            sum = num ++;
        }
        System.out.println(sum);*/
    }

    /**
     * 查看下以及所有目录名存入list中
     *
     * @return
     */
    public static ArrayList<String> findFileDirName(String dirname) {
        ArrayList<String> dirList = new ArrayList<>();
        File f1 = new File(dirname);
        int num = 1;
        int sum = 0;

        if (f1.isDirectory()) {
            System.out.println("*********************************");
            System.out.println("--> " + dirname);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                dirList.add(s[i]);
                //System.out.println("目录：" + s[i]);
            }
        } else {
            System.out.println(dirname + " is not a directory");
        }

        for (String filename : dirList) {
            System.out.println(filename);
            sum = num++;
        }
        System.out.println(sum);
        return dirList;
    }
}