package com.Bridgelabz;
import java.util.Scanner;

public class linecomparison {

    Scanner sc=new Scanner(System.in);
    public static int x1,x2,y1,y2;
    public static double length,flength,slength;

    public void getvalue()
    {
        System.out.println("\n\ngetting two line input:");
        System.out.println("\n  First line:");
        values();
        System.out.println("\n first Line");
        length();
        flength=length;
        System.out.print("\n  The first line for the values ("+x1+","+x2+") , (y1,y2) as ("+y1+","+y2+") is "+flength);
        System.out.println("\n  for second line:");
        values();
        System.out.println("\n\nFor second line");
        length();
        slength=length;
        System.out.print("\n  The second line for the values of (x1,x2) as ("+x1+","+x2+") & (y1,y2) as ("+y1+","+y2+") is "+slength);
    }

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

    public void checkequality()
    {
        System.out.println("\n Equality of line:");
        Double line1=new Double(flength);
        Double line2=new Double(slength);
        boolean equal= line1.equals(line2);
        if(equal)
            System.out.println("Boundary of 1st line is equal to endpoint of 2nd line");
        else
            System.out.println("Boundary of 1st line is not equal to endpoint of 2nd line");
    }

    public void compare()
    {
        Double line1=new Double(flength);
        Double line2=new Double(slength);
        int equal=line1.compareTo(line2);
        if(equal>0.0)
            System.out.println("The endpoint of 1st line is greater than endpoint of 2nd line");
        else if(equal<0.0)
            System.out.println("The endpoint of 1st line is lesser than endpoint of 2nd line");
        else
            System.out.println("The endpoint of 1st line is equal to endpoint of 2nd line");
    }

    public static void main(String[] args) {

        System.out.println("\n Welcome to Line Comparison Computation Program");

        linecomparison line= new linecomparison();
        line.getvalue();
        line.checkequality();
        line.compare();
    }
}