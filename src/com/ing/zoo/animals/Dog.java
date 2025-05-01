package com.ing.zoo.animals;

import java.util.Scanner;

import com.ing.zoo.base.Animal;
import com.ing.zoo.diet.Carnivore;

public class Dog extends Animal implements Carnivore {

    public String trick;

    public Dog(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "woof";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "what if dogs would rule the world?";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welk trucje moet spot doen: ");
        String input = scanner.nextLine();
        switch (input) {
            case "poot":
                trick = "Spot geeft zijn poot";
                break;
            case "zit":
                trick = "Spot gaat zitten";
                break;
            default:
                trick = "Spot snapt niet wat je zegt";
                break;
        }
        System.out.println(trick);
    }
}
