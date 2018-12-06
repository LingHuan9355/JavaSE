package com.hr.test;

import org.junit.Test;

import com.hr.array.test.SortArray;



/**
 * @ClassName : TestSortArray
 * Created with IDEA
 * @author:CarlLing
 * @CreateDate : 2018-11-02 10:33
 * @Description : 测试数组排序算法（Java从入门到精通）
 * 1.冒泡排序
 * 2.直接选择排序
 * 3.反转排序
 * （快速排序）
 */
public class TestSortArray {

    /**
     * 1.冒泡排序
     */
    @Test
    public void testBubbleSort(){
        int [] array = {63,4,24,1,3,15};
        SortArray sorter = new SortArray();
        sorter.bubbleSort(array);
    }

    /**
     * 2. 直接选择排序
     */
    @Test
    public void testSelectSort(){
        int [] array = {63,4,24,1,3,15};
        SortArray sorter = new SortArray();
        sorter.selectSort(array);
    }

    /**
     * 3. 反转排序 (注意：不是比较元素的大小，而是比较元素下标位置)
     */
    @Test
    public void testReverseSort(){
        int [] array = {10,20,70,40,50,60,30};
        SortArray sorter = new SortArray();
        sorter.reverseSort(array);

       int t = "abc".length();
        System.out.println(t);

    }
}