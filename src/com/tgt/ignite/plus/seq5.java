package com.tgt.ignite.plus;

import java.util.Scanner;

public class seq5 {
    public static void main(String[] args) {
        int i, n;
        Scanner read = new Scanner(System.in);
        System.out.println("enter number");
        n = read.nextInt();
        for (i = 1; i <= n; i++) {
            if (i == 4) {
                continue;
            }
            System.out.print(i * i + " ");
        }
    }
}
