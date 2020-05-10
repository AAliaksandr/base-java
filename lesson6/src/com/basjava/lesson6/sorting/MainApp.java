package com.basjava.lesson6.sorting;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Введите массив чисел:");
        int[] size = ScannerUtil.getArraySize();
        System.out.println("1 - Сортировка пузырьком\n2 - Сортировка методом выбора\n3 - Сортировка методом Шелла\n0 - Выход");
        SortType sortType = ScannerUtil.getSortType();
        size = ScannerUtil.sort(size, sortType);

        System.out.println(Arrays.toString(size));

   }
}
