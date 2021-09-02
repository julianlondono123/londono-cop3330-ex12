import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println( "Enter the principal" );
        double prin = input.nextDouble();
        System.out.println( "Enter the rate of interest" );
        double rate = input.nextDouble()/100;
        System.out.println( "Enter the number of years" );
        double year = input.nextDouble();

        double value = prin * ( 1 + (rate * year));


        System.out.println("After " + year + " years at " + (rate*100) + "%, the investment will be worth " + value);

    }
}
