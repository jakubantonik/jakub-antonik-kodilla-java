package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Podaj swoje imię");
        System.out.println(name + " \n ");
        System.out.println(name + ", zwycięstwo następuje po 3 rundach");

        System.out.println("Zasady gry są następujące: \n" +
                "klawisz (1) - kamień \n" +
                "klawisz (2) - papier \n" +
                "klawisz (3) - nożyce \n" +
                "klawisz (x) - zakończenie gry \n" +
                "klawisz (n) - nowa gra \n " +
                "\n" +
                "Zaczynamy? :)  (y/n)" );
        String letter = scanner.nextLine();

        if(letter == "y"){
            System.out.println("Twój ruch");
        }



    }
}
