package com.example.main;

import com.example.sum.Sum;

public class Main {

    public static void main(String[] args) {
        Sum sum = new Sum();

        int[] tab = sum.getNumber();

        System.out.println(sum.sumTab(tab));
    }
}
