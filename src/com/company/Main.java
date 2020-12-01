package com.company;

public class Main {

    public static void main(String[] args) {
    System.out.println(addOdds(11));
    System.out.println(addOdds(21));
    System.out.println(addOdds(17));
    System.out.println();
    System.out.println(howManyYears(120000000, 200000000));
    System.out.println(howManyYears(150000000, 170000000));
    System.out.println();
    printSum(6);
    printSum(8);
    printSum(10);
    System.out.println();
    System.out.println(isPerfectSquare(4));
    System.out.println(isPerfectSquare(121));
    System.out.println(isPerfectSquare(54));
    System.out.println(isPerfectSquare(7));
    System.out.println();
    System.out.println(sumDigits(1241));
    System.out.println(sumDigits(56));
    System.out.println(sumDigits(12));


    }

    public static int addOdds(int n)
    {
        int sum = 0;
        int x = 1;
        while(x <= n)
        {
            sum += x;
            x += 2;
        }
        return sum;
    }

    public static int howManyYears(double startpop, double endpop)
    {
        int years = 0;
        while(startpop < endpop)
        {
            startpop += startpop*0.0113;
            years++;
        }
        return years;
    }

    public static void printSum(int x)
    {
        int n = 1;
        int total = 1;
        while (n <= x)
        {
            if(n == x)
            {
                System.out.print(n + " = ");
            }
            else
            {
                System.out.print(n + " + ");
                total += n;
            }
            n++;
        }
        System.out.print(total);
        System.out.println();
    }

    public static boolean isPerfectSquare(int n)
    {
        int start = 1;
        int total = 0;
        while(n > total)
        {
            total += start;
            start += 2;
        }
        return (n == total);
    }

    public static int sumDigits(int x)
    {
        int digit;
        int total = 0;
        while(x > 0)
        {
            digit = x%10;
            total += digit;
            x = x/10;
        }
        return total;
    }
}
