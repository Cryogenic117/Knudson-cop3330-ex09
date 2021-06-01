package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int length, width,sf;
        double conversion = 350.0;
        double paint;

        System.out.println("What is the length of the room?");
        length = input.nextInt();
        System.out.println("What is the width of the room?");
        width = input.nextInt();

        sf = length * width;
        paint = Math.ceil(sf / conversion);
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet", (int)paint, sf);
    }
}
