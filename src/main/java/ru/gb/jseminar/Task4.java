package ru.gb.jseminar;

import java.util.Scanner;

public class Task4 {

    //Реализовать функцию возведения числа а в степень b. a, b – целые числа.
    //
    //Пример 1: а = 3, b = 2, ответ: 9
    //Пример 2: а = 2, b = -2, ответ: 0.25
    //Пример 3: а = 3, b = 0, ответ: 1
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        Scanner iScan = new Scanner(System.in);
        System.out.printf("Введите число A: ");
        int a = iScan.nextInt();
        System.out.printf("Введите число B: ");
        int b = iScan.nextInt();
        System.out.printf("A в степени B: " + task4.exponentiation(a, b));
        iScan.close();
    }

    public double exponentiation(int a, int b){
        return Math.pow(a, b);
    }
}
