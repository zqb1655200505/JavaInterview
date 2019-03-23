package com.zqb.sort;

/**
 * Created by root on 2019/3/20.
 */
public class ShellSort extends AbstractSort {

    private int[] dist;//增量序列，需要保证最后一个增量为1,且最大增量即第一个增量不超过数组长度一半

    public ShellSort(int[] dist){
        this.dist=dist;
    }


    @Override
    public int[] sort(int[] array)
    {
        if(dist==null||dist[dist.length-1]!=1||dist[0]>array.length/2)
        {
            System.out.println("增量数组错误，请检查");
            return null;
        }
        for(int i=0;i<dist.length;i++)
        {
            for(int j=dist[i];j<array.length;j++)
            {
                if(array[j]<array[j-dist[i]])
                {
                    int temp=array[j];
                    int k;
                    for(k=j;k>=dist[i];k-=dist[i])
                    {
                        if(array[k-dist[i]]>temp)
                            array[k]=array[k-dist[i]];
                        else
                            break;
                    }
                    array[k]=temp;
                }
            }
        }
        return array;
    }
}
