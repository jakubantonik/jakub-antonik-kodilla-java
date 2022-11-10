package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String beautyText = poemBeautifier.beautify("Pogoda jest ładna", (text -> text.toUpperCase()) );
        System.out.println(beautyText);

        String beautyText2 = poemBeautifier.beautify("Harry Potter i Kamień filozoficzny", (text -> "ABC" + text + "ABC"));
        System.out.println(beautyText2);

        String beautyText3 = poemBeautifier.beautify("PRZYKŁadoWYMI UPIększaCZAMI tEKSTu mOGą BYć", (text -> text.toLowerCase()));
        System.out.println(beautyText3);

        String beautyText4 = poemBeautifier.beautify("W tym pakiecie stwórz interfejs", (text -> text.replaceAll("i", "<3") ));
        System.out.println(beautyText4);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


    }
}
