package com.zqb.sort;

/**
 * Created by root on 2019/3/13.
 * 冒泡排序（Bubble Sort）也是一种简单直观的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。
 * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端
 */
public class BubbleSort extends AbstractSort {

    @Override
    public int[] sort(int[] array) {
        for(int i=0;i<array.length-1;i++)
        {
            for(int j=0;j<array.length-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
}
