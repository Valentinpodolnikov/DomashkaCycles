package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Введите номер месяца: ");
        number = input.nextInt();

        if(number==12){
            System.out.println("Winter");
        }

        else if(1<=number && number<=2){
            System.out.println("Winter");
        }
        else if(3<=number && number<=5){
            System.out.println("Spring");
        }
        else if(6<=number && number<=8){
            System.out.println("Summer");
        }
        else if(9<=number && number<=11){
            System.out.println("Autumn");
        }
    }
}
