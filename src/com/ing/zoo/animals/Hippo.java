package com.ing.zoo.animals;

import com.ing.zoo.base.Animal;
import com.ing.zoo.diet.Herbivore;

public class Hippo extends Animal implements Herbivore {

    public Hippo(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
