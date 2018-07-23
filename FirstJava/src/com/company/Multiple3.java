package com.company;

import java.util.Scanner;

public class Multiple3 {
    public Multiple3(){
        System.out.println("Input your Number");
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        System.out.println(is_3plex(t));
    }
    String is_3plex(int num){
        if(num%3==0)
            return "3의 배수입니다";
        else
            return "3의 배수가 아닙니다";
    }
}
