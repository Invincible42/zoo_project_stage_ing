package com.ing.zoo;

import com.ing.zoo.animals.*;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Object[] animals = new Object[7];

        Lion henk = new Lion("henk");
        animals[0] = henk;
        Hippo elsa = new Hippo("elsa");
        animals[1] = elsa;
        Pig dora = new Pig("dora");
        animals[2] = dora;
        Tiger wally = new Tiger("wally");
        animals[3] = wally;
        Zebra marty = new Zebra("marty");
        animals[4] = marty;
        Turtle harry = new Turtle("harry");
        animals[5] = harry;
        Dog spot = new Dog("spot");
        animals[6] = spot;

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Voer uw command in: ");
            input = scanner.nextLine();

            if (input.equals("exit")) {
                System.out.println("Programma beëindigd.");
                break;
            }

            switch (input) {
                case "hello":
                    henk.sayHello();
                    elsa.sayHello();
                    dora.sayHello();
                    wally.sayHello();
                    marty.sayHello();
                    harry.sayHello();
                    spot.sayHello();
                    break;
                case "hello henk":
                    henk.sayHello();
                    break;
                case "hello elsa":
                    elsa.sayHello();
                    break;
                case "hello dora":
                    dora.sayHello();
                    break;
                case "hello wally":
                    wally.sayHello();
                    break;
                case "hello marty":
                    marty.sayHello();
                    break;
                case "hello harry":
                    harry.sayHello();
                    break;
                case "hello spot":
                    spot.sayHello();
                    break;
                case "give leaves":
                    elsa.eatLeaves();
                    dora.eatLeaves();
                    marty.eatLeaves();
                    harry.eatLeaves();
                    break;
                case "give meat":
                    henk.eatMeat();
                    dora.eatMeat();
                    wally.eatMeat();
                    spot.eatMeat();
                    break;
                case "perform trick":
                    dora.performTrick();
                    wally.performTrick();
                    harry.performTrick();
                    spot.performTrick();
                    break;
                default:
                    System.out.println("Unknown command: " + input);
                    break;
            }
        }
    }
}
