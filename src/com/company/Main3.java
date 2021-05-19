package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;


        System.out.print("Введите год: ");
        number = input.nextInt();

        if(number%4==0 && number%100 !=0){
            System.out.println("12/09"+number);
        }
        else  if(number%400 == 0) {
            System.out.println("12/09/"+number);
        }
        else {
            System.out.println("13/09/"+number);
        }

        }
    }

