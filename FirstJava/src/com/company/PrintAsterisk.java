package com.company;

import java.util.Scanner;

public class PrintAsterisk {
    public PrintAsterisk(){
        int t = (new Scanner(System.in)).nextInt();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t - i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
