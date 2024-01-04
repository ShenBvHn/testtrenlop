package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        while (number >= 1) {
            if (number == 2 || number == 4) {
                number--;
                continue;
            }
            System.out.print(number + "-");
            number--;
        }


    }}
