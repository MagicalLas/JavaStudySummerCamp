package com.company;

import java.util.Random;
import java.util.Scanner;

public class UpDown {
    int objective;
    boolean gameState;
    public UpDown(){
        gameState = true;
        SettingRandomInt();
        while(gameState){
            Game();
        }
    }
    private void SettingRandomInt(){
        this.objective = (new Random().nextInt(100));
    }
    private void Game(){
        int result = IsBigger();
        if(result == 0){
            System.out.println("OK");
            confirmEnd();
        }
        else if(result == 1)
            System.out.println("UP");
        else
            System.out.println("DWON");
    }
    private void confirmEnd(){

        System.out.println("다시하겠습니까?");
        String S = new Scanner(System.in).nextLine();
        if(S.equals("Y")){
            gameState = true;
        }
        else
            gameState = false;
    }
    private int IsBigger(){
        int input = 3;
        try {
            input = new Scanner(System.in).nextInt();
        }catch (Exception s){
        }
        if(input == objective)
            return 0;
        else if(objective<input)
            return 1;
        return 2;
    }
}
