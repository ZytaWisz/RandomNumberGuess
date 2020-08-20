package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number=(int)(Math.random()*100)+1;
        for (int i = 10; i >0; i--) {
            Scanner scanner=new Scanner(System.in);
            int readNumber=scanner.nextInt();

            if(number < readNumber){
                System.out.println("To much, you have "+i+" tries");
            }
            else if(number> readNumber){
                System.out.println(" to small, you have "+i+" tries");
            }
            else{
                System.out.println("correct");
                break;
            }
            if( i==1)
            System.out.println( "YOU LOSE hahahahaha");

        }


    }
}
