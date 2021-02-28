package ru.vsu.cs;

import java.util.Scanner;

public class firstPart
{
    public static void main()
    {
        double x = readX();

        if (x < 64 && x != 0)
        {
            System.out.println("Error. Your X should be more then 63");
        }
        else
        {
            calculateAll(x);
        }
    }

    private static double calculateNumerator(double x)
    {
        // n - число вычитаемое из X; multiplier - множитель; numeratorResult - результат числителя; i - штук скобок ;
        double n = 0;
        double numeratorResult = 1;

        for (int i = 0; i < 32; i++)
        {
            n = n + 2;
            double multiplier = x - (n);

            numeratorResult = numeratorResult * multiplier;
        }
        return numeratorResult;
    }

    private static double calculateDenominator(double x)
    {
        // n - число вычитаемое из X; multiplier - множитель; denominatorResult - результат знаменателя; i - штук скобок;
        double n = 1;
        double denominatorResult = 1;

        for (int i = 0; i < 32; i++)
        {
            double multiplier = x - n;
            n = n + 2;

            denominatorResult = denominatorResult * multiplier;
        }
        return denominatorResult;
    }

    private static void calculateAll(double x)
    {
        double finalResult = calculateNumerator(x) / calculateDenominator(x);

        System.out.println("Final result is: " + finalResult);
    }

    private static double readX()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X: ");

        return scanner.nextDouble();
    }
}
