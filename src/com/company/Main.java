package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // содержит три целых положительных числа - r1, r2, r3 (1 ≤ r1, r2, r3 ≤ 109)


        int radiusField;
        int radiusPlate1;
        int radiusPlate2;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите радиус поля: ");
        radiusField = input.nextInt();

        System.out.print("Введите радиус первой тарелки: ");
        radiusPlate1 = input.nextInt();

        System.out.print("Введите радиус второй тарелки: ");
        radiusPlate2 = input.nextInt();

        int sumRadiusPlate = radiusPlate1+radiusPlate2;

        //общий радиус тарелок не должен превышать размеры поля

        if(sumRadiusPlate<=radiusField) {
            System.out.println("YES");
        }
            else{
                System.out.println("NO");
            }
        }


    }

