package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Marks student = new Marks();

        for (int i = 1; i <= 2; i++){
            student.mk1 = scan.nextInt();
            student.mk2 = scan.nextInt();
            student.tot();
        }
    }
}
