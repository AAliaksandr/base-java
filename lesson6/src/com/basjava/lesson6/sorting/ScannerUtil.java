package com.basjava.lesson6.sorting;

import java.util.Scanner;

public class ScannerUtil {
    public static Scanner scanner = new Scanner(System.in);

    public static int[] getArraySize(){
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static SortType getSortType(){
        int sort = scanner.nextInt();
        switch (sort) {
            case 0:
                System.exit(1);
            case 1:
               return SortType.BUBBLE_SORT;
            case 2:
                return SortType.SELECTION_SORT;
            case 3:
                return SortType.SHELL_SORT;
            default:
                throw new IllegalStateException("Unexpected value: " + sort);
        }
    }

    public static int[] sort(int[] array, SortType sortType) {
        System.out.println("1 - По возрастанию:\n2 - По убыванию:");
        int sort = scanner.nextInt();
        switch (sortType) {
            case BUBBLE_SORT:
                Sort sort1 = new BubbleSort(array);
                return sort(sort1, sort);
            case SELECTION_SORT:
                Sort sort2 = new SelectionSort(array);
                    return sort(sort2, sort);
            case SHELL_SORT:
                Sort sort3 = new ShellSort(array);
                   return sort(sort3, sort);
            default:
                throw new IllegalStateException("Unexpected value: " + sort);
        }
    }

    private static int[] sort(Sort sort1, int sort){
        if (sort == 1) {
            return sort1.ascSort();
        } else {
           return sort1.descSort();
        }
    }
    private static int[] sort1(Sort sort2, int sort){
        if (sort == 1){
            return sort2.ascSort();
        }else {
            return sort2.descSort();
        }
    }
    private static int[] sort2(Sort sort3, int sort){
        if (sort == 1){
            return sort3.ascSort();
        }else {
            return sort3.descSort();
        }
    }
}
