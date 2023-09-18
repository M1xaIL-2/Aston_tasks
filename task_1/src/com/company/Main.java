package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Ввод числа
        int  x = scanner.nextInt(); // Передача переменной x введённого значения
        if (x>7) {  System.out.println("Привет");
        }  // прописанный цикл если введённое число больше 7, то вывести “Привет”

    }
}
