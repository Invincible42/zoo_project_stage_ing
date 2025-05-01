package com.ing.zoo.animals;

import com.ing.zoo.base.Animal;
import com.ing.zoo.diet.Herbivore;

public class Turtle extends Animal implements Herbivore {

    public String trick;

    public Turtle(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "euuuuuuhhhh";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "njom njom";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        trick = "spins in circles like a beyblade";
        System.out.println(trick);
    }
}
