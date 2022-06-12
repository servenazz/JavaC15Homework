package by.tms.circles.lesson3;

import java.util.Scanner;

public class Circles {

    public static void main(String[] args) {

        // Задание 1.
        // Написать программу, вычисляющую сумму цифр введенного пользователем целого числа


        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter any number in the range of 1-100 to get the sum ...");
        int variable = myScanner.nextInt();

        if (variable < 100) {
            System.out.println(variable + variable);
        } else {
            System.out.println("The entered number does not fall in the required range!");
        }
    }
}
        // Задание 2.
        // Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введенного
        // пользователем целого числа


