package com.zqb.sort;

public class Test {

    public static void main(String[] args) throws Exception {
//        AbstractSort bubbleSort=new BubbleSort();
//        System.out.println("BubbleSort:");
//        AbstractSort.printResult(bubbleSort.sort(AbstractSort.ARRAY));
//
//        AbstractSort selectSort=new SelectSort();
//        System.out.println("SelectSort:");
//        AbstractSort.printResult(selectSort.sort(AbstractSort.ARRAY));
//
//
//        AbstractSort shellSort=new ShellSort(new int[]{5,3,1});
//        System.out.println("ShellSort:");
//        AbstractSort.printResult(shellSort.sort(AbstractSort.ARRAY));

        AbstractSort quickSort=new QuickSort();
        System.out.println("QuickSort:");
        AbstractSort.printResult(quickSort.sort(AbstractSort.ARRAY));
    }
}
