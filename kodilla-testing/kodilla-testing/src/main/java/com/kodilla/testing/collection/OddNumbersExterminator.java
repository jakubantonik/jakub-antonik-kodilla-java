package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers){

        ArrayList<Integer>oddNumbersExterminator = new ArrayList<>();

        for (int number: numbers){
            if(number%2==0){
                oddNumbersExterminator.add(number);
            }
        }
        return oddNumbersExterminator;
    }
}
