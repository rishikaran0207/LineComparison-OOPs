package com.Bridgelabz;
import java.util.Scanner;

public class linecomparison {

    Scanner sc=new Scanner(System.in);
    public static int x1,x2,y1,y2;

    public void values()
    {
        System.out.println("\n Inputs of x1, x2, y1, y2");
        System.out.println("\n  x1:");
        x1=sc.nextInt();
        System.out.println("\n  x2:");
        x2=sc.nextInt();
        System.out.println("\n  y1:");
        y1=sc.nextInt();
        System.out.println("\n  y2:");
        y2=sc.nextInt();
    }

    public void length()
    {
        double length= Math.sqrt( ( (Math.pow( ( x2-x1 ),2 ) ) + (Math.pow( ( y2-y1 ),2 ) ) ) );
        System.out.println("\n  The length ("+x1+","+x2+"),("+y1+","+y2+") is "+length);
    }

    public static void main(String[] args) {

        System.out.println("\n Welcome to Line Comparison Computation Program");

        linecomparison line= new linecomparison();
        line.values();
        line.length();
    }
}