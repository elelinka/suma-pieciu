package com.example.sum;

import java.util.Scanner;

public class Sum {

    public String sumTab(int[] tab) {
        int sum = sumNumbers(tab[0], tab[2], tab[4]);
        return "Suma liczb " + tab[0] + ", " + tab[2] + " oraz " + tab[4] + " jest rowna " + sum;
    }

    public int[] getNumber() {
        Scanner userInput = new Scanner(System.in);
        int[] numbersFromUser = new int[5];

        System.out.println("Podaj pierwsza liczbe");
        numbersFromUser[0] = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Podaj druga liczbe");
        numbersFromUser[1] = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Podaj trzecia liczbe");
        numbersFromUser[2] = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Podaj czwarta liczbe");
        numbersFromUser[3] = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Podaj piata liczbe");
        numbersFromUser[4] = userInput.nextInt();
        userInput.nextLine();

        userInput.close();
        return numbersFromUser;
    }

    public int sumNumbers(int a, int b, int c) {
        return a + b + c;
    }
}
