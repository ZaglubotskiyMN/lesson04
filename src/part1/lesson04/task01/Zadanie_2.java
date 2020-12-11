package part1.lesson04.task01;

import javax.swing.*;

public class Zadanie_2 {

    public static void main(String[] args) {


        int x = 2 ;// Введите значение


        if (x>0) {
            System.out.print("Положительное" + " ");
            if (x % 2 == 0)
                System.out.print("Четное");
            else
                System.out.print("Нечетное");
        }

        if (x<0)
            System.out.println("Отрицательное");
        if (x==0)
            System.out.println("Нулевое");




    }
}

