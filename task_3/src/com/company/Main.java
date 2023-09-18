package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int length = input.nextInt();
        int arr[] = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) { //Задаём цикл, учитывая
            arr[i] = input.nextInt(); // ввод нового значения в массив на место индекса i
            if ((arr[i] % 3 == 0) && (arr[i] != 0)) { // Задание условия цикла чтобы при делении числа на 3 не было остатка И число не было равно 0
                System.out.print(arr[i] + " кратно 3" + "; ");
            }
        }
    }
}

