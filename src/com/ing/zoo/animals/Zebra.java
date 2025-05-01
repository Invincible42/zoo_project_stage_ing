package com.ing.zoo.animals;

import com.ing.zoo.base.Animal;
import com.ing.zoo.diet.Herbivore;

public class Zebra extends Animal implements Herbivore {

    public String trick;

    public Zebra(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
