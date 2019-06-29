package com.gz;

public class BitSum {

    public static int addTwoSum(int a, int b) {
            while (b != 0) {
                int _a = a ^ b;
                int _b = (a & b) << 1;
                a = _a;
                b = _b;
            }
            System.out.println(a);
            return a;
        }
    }
