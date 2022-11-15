package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double f = 0;

        double a;
        System.out.print("Введите сторону а: ");
        a = scan.nextDouble();

        double b;
        System.out.print("Введите сторону b: ");
        b = scan.nextDouble();

        double c;
        System.out.print("Введите сторону c: ");
        c = scan.nextDouble();

        if (a>b) {
            f=b;
            b=a;
            a=f;
        }

        if (a>c) {
            f=c;
            c=a;
            a=f;
        }

        if (b>c) {
            f=c;
            c=b;
            b=f;
        }


        if ( (a+b) > c) {
            System.out.println("Треугольник существует");
        }else {
            System.out.println("Тругольник не существует");
            return;
        }

        double r = Math.sqrt(((-a+b+c)*(a-b+c)*(a+b-c))/4*(a+b+c));

        double R;
        System.out.print("Ведите радиус: ");
        R = scan.nextDouble();


        if (r == R) {
            System.out.println("Окружность можно вписать");
        }else {
            System.out.println("Окружность не может быть вписана");
        }

    }


}