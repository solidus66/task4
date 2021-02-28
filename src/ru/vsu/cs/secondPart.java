package ru.vsu.cs;

import java.util.Scanner;

public class secondPart
{
    public static void main()
    {
        double x = readVariable('x');
        double a = readVariable('a');

        calculateFinalResult2(x, a);
    }

    private static double calculate(double x, double a)
    {
        double n = 0;
        double d = (x - a);

        for (int i = 0; i < 5; i++)
        {
            n = d * x - a;
            d = n;
        }
        return n;
    }

    private static void calculateFinalResult2(double x, double a)
    {
        double result = calculate(x, a);
        System.out.println(result);
    }

    private static double readVariable(char variable)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter %s: ", variable);

        return scanner.nextDouble();
    }
}

