package com.zqb.sort;

/**
 * Created by root on 2019/3/20.
 */
public class QuickSort extends AbstractSort {
    @Override
    public int[] sort(int[] array) {
        quickSort(array,0,array.length-1);
        return array;
    }

    private void quickSort(int[] array,int low,int high)
    {
        if(low<high)
        {
            int patition=patitionMideum3(array,low,high);
            quickSort(array,low,patition-1);
            quickSort(array,patition+1,high);
        }

    }


    //以第一个元素作为枢纽
    private int patition(int[] array,int low,int high)
    {
        int flag=array[low];
        while (low<high)
        {
            while (low < high && array[high]>=flag)//注意可以取等号，即相同时也继续前移
                high--;
            array[low]=array[high];
            while (low < high && array[low]<=flag)
                low++;
            array[high]=array[low];
        }
        array[low]=flag;
        return low;
    }

    //以第一个元素、最后一个元素和中间元素的中间值作为枢纽
    private int patitionMideum3(int[] array,int low,int high)
    {
        int mid=(high-low)/2;
        int temp;
        //high位置为中位数
        if(array[high]>=array[mid]&&array[high]<=array[low]||array[high]<=array[mid]&&array[high]>=array[low])
        {
            temp=array[high];
            array[high]=array[low];
            array[low]=temp;
        }
        else if(array[mid]>=array[low]&&array[mid]<=array[high]||array[mid]<=array[low]&&array[mid]>=array[high])//mid位置为中位数
        {
            temp=array[mid];
            array[mid]=array[low];
            array[low]=temp;
        }

        return patition(array,low,high);
    }
}
