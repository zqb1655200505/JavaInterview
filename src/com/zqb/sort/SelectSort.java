package com.zqb.sort;

/**
 * Created by root on 2019/3/13.
 *      1、首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
        2、再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
        3、重复第二步，直到所有元素均排序完毕
 */
public class SelectSort extends AbstractSort {
    @Override
    public int[] sort(int[] array) {
        for(int i=0;i<array.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[j]<array[min])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                int temp=array[i];
                array[i]=array[min];
                array[min]=temp;
            }
        }
        return array;
    }
}
