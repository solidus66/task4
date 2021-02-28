package ru.vsu.cs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        choseWhatToDo();
    }

    private static void choseWhatToDo()
    {
        System.out.println("Please, chose, what do you want to calculate: \n 1) First example \n 2) Second example \n Input 1 or 2: ");

        Scanner scanner = new Scanner(System.in);

        int selectionResult = scanner.nextInt();

        if (selectionResult == 1)
        {
            ru.vsu.cs.firstPart.main();
        }

        if (selectionResult == 2)
        {
            ru.vsu.cs.secondPart.main();
        }
    }
}
