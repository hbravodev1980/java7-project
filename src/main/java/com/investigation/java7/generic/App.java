package com.investigation.java7.generic;

import com.investigation.java7.common.Animal;
import com.investigation.java7.common.Cat;
import com.investigation.java7.common.Dog;
import com.investigation.java7.common.User;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Printer<String> stringPrinter = new Printer<>("Hello");
        stringPrinter.print();

        Printer<User> userPrinter = new Printer<>(new User(1, "Charles", 20));
        userPrinter.print();

        List<User> users = Arrays.asList(
                new User(1, "Albert", 25),
                new User(2, "Harry", 34));
        Printer<List<User>> listPrinter = new Printer<>(users);
        listPrinter.print();

        PrinterAnimal<Animal> dogPrinter = new PrinterAnimal<>(new Dog());
        dogPrinter.print();

        PrinterAnimal<Animal> catPrinter = new PrinterAnimal<>(new Cat());
        catPrinter.print();

        PrinterParameter<String> printerParameter = new PrinterParameter<>();
        printerParameter.printWithParameter("Print test");
        System.out.println(printerParameter.returnWithParameter("Return test"));

        PrinterParameter.printWithParameterStatic(12.65);
        System.out.println(PrinterParameter.returnWithParameterStatic(12.65));

        List<Animal> animals = Arrays.asList(new Dog(), new Cat());
        PrinterParameter.printList(animals);
    }
}