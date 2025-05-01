package com.ing.zoo.animals;

import com.ing.zoo.base.Animal;
import com.ing.zoo.diet.Carnivore;

public class Lion extends Animal implements Carnivore {

    public Lion(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
