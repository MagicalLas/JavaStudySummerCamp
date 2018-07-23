package com.company;

import java.util.Arrays;
import java.util.Scanner;

@FunctionalInterface
interface Printable{
    String print();
}
class Sheet implements Printable{
    String[] arr = new String[10];
    public void GetArr(int t, String s){
        arr[t]=s;
    }
    @Override
    public String print() {
        return Arrays.stream(arr).map((i)->{if(i == null)return "---";return i;}).reduce((acc, i) -> {return acc+" "+i;}).get();
    }
}
public class Consert {
    Sheet s, a, b;
    int input;
    Consert(){
        s = new Sheet();
        a = new Sheet();
        b = new Sheet();
        while(true){
            System.out.println("예약 : 1, 조회 : 2, 취소 : 3, 종료 : 4");
            play();
        }
    }
    void play(){
        GetInput(-1,10);
        if(input == 1){
            System.out.println("S : 1, A : 2, B : 3");

            GetInput(0,4);
            Sheet sheet = null;
            if(input == 1)
                sheet = s;
            if(input == 2)
                sheet = a;
            if(input == 3)
                sheet = b;

            System.out.println("Sheat : "+sheet.print());

            System.out.println("Number");
            GetInput(-1,10);
            System.out.println("Name");
            String st = new Scanner(System.in).nextLine();

            sheet.arr[input]=st;
        }else if(input == 2){
            state();
        }else if(input == 3){
            System.out.println("S : 1, A : 2, B : 3");
            GetInput(0,4);
            Sheet sheet = null;
            if(input == 1)
                sheet = s;
            if(input == 2)
                sheet = a;
            if(input == 3)
                sheet = b;

            System.out.println("Sheat : "+sheet.print());
            String st = new Scanner(System.in).nextLine();
            for (int i = 0; i < 10; i++) {
                if(sheet.arr[i]!= null){
                    if(sheet.arr[i].equals(st))
                        sheet.arr[i]=null;
                }
            }
        }else if(input == 4){
            System.exit(0);
        }

    }
    void GetInput(int l, int r){
        try {
            input = new Scanner(System.in).nextInt();
        }catch (Exception s){
            System.out.println("다시입력");
            GetInput(l,r);
            return;
        }
        if(!(input<r && input>l)){
            System.out.println("다시입력");
            GetInput(l,r);
        }
    }
    void state(){
        System.out.println("S : "+s.print());
        System.out.println("A : "+a.print());
        System.out.println("B : "+b.print());

    }
}
