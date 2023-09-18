package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println ("Введите необходимое имя и нажмите Enter");
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine(); // Передача переменной x введённого значения
        if (x.equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет, " + x);}
        else System.out.println("Нет такого имени");
    }
}
