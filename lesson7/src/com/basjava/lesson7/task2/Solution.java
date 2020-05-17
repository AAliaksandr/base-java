package com.basjava.lesson7.task2;

public class Solution {

    public void recursion(int a) {

        System.out.print(a % 10);

        if (a >= 10) {
           recursion(a / 10);
        }
    }
}