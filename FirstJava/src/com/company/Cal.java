package com.company;

import java.util.Scanner;

@FunctionalInterface
interface Calculable{
    public int cal(int a, int b);
}
public class Cal {


    Calculable add = (int a, int b)->{return a+b;};
    Calculable sub = (int a, int b)->{return a-b;};
    Calculable mul = (int a, int b)->{return a*b;};
    Calculable div = (int a, int b)->{return (b!=0)?a/b:0;};


    Cal(){
        Scanner sc = new Scanner(System.in);
        int a, b;
        String s;
        a = sc.nextInt();
        b = sc.nextInt();
        s = sc.next();
        Calculable Processer = null;
        if(s.equals("+")){
            Processer = add;
        }else if(s.equals("-")){
            Processer = sub;
        }else if(s.equals("*")){
            Processer = mul;
        }else if(s.equals("/")){
            Processer = div;
        }
        System.out.print(Processer.cal(a,b));
    }
}
