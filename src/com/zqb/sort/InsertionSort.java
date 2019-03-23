package com.zqb.sort;

/**
 * Created by root on 2019/3/13.
 */
public class InsertionSort extends AbstractSort {
    @Override
    public int[] sort(int[] array) {
        for(int i=1;i<array.length;i++)
        {
            int temp=array[i];
            int index=0;
            for(int j=i-1;j>0&&array[j]>temp;j--)
            {
                index=j;
                array[j]=array[j-1];
            }
            array[index]=temp;

        }
        return array;
    }
}
