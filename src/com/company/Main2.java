package com.company;


import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {

          //Старая версия была через else if , обе не получается загрузить на сайт (Wrong answer)


        Scanner input = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int number;


        number = input.nextInt();

        switch (number){
            case 12:
                out.println("Winter");
                break;
            case 1:
            case 2:
                out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                out.println("Autumn");
                break;
            default:
                out.println("ERROR");

        }
        out.flush();

    }
}
