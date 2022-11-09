package org.example;

public class Main {
    public static void main(String[] args) {
        double test1 = area(5);
        double test2 = area(10,2);

        System.out.println(test1);
        System.out.println(test2);
    }

    public static double area(double radius){
        // Check if the input is valid
        if(radius < 0)
            return -1;

        // Calculate the area
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y){
        // Check if the input is valid
        if(x < 0 || y < 0)
            return -1;

        // Calculate the area
        return x * y;
    }
}