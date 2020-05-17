package com.basjava.lesson7.task1;

public class Solution {

    public String recursion(int a) {

        if (a == 0) {
            return "0";
        }
        return recursion(a - 1) + " " + a;
    }
}
