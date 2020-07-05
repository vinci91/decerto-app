package eu.fitk.decertoapp;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Generator {

    //ilość liczb, które będziemy chcieli wylosować
    int amountOfNumbers = 2;

    //przedział liczb, z jakiego będziemy losować
    int intervalStart = 0;
    int intervalEnd = 100;

    Random generator = new Random();

    //metoda służąca do losowania liczb
    public LinkedList getRandomNumbers() {

        LinkedList randomNumbersList = new LinkedList<>();

        for (int i = 0; i < amountOfNumbers; i++) {
            randomNumbersList.add(generator.nextInt(intervalEnd - intervalStart) + intervalStart);
            System.out.println("Wartość liczby o indexie " + i + " wynosi " + randomNumbersList.get(i));
        }

        return randomNumbersList;
    }

    //metoda służąca do przeprowadzania operacji (w tym przypadku dodawania) na wylosowanych liczbach
    public Integer performOperation() {

        LinkedList<Integer> listOfNumbers = getRandomNumbers();
        ListIterator<Integer> listOfNumbersIterator = listOfNumbers.listIterator();

        Integer result = 0;

        while (listOfNumbersIterator.hasNext()) {
            result += listOfNumbersIterator.next();
        }

        System.out.println("Wynik operacji wynosi: " + result);
        return result;
    }
}



