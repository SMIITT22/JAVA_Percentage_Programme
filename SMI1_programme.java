package com.company;
import java.util.Scanner;

public class SMI1_programme {
    public static void main(String[] args) {
        System.out.println("Enter your marks below !");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your maths marks: ");
        float maths = sc.nextFloat();
        System.out.println("enter your biology marks: ");
        float biology = sc.nextFloat();
        System.out.println("enter your chemistery marks: ");
        float chemistery = sc.nextFloat();
        System.out.println("your total is: ");
        float total = maths + biology + chemistery;
        System.out.println(total);
        System.out.println("your percentage is: ");
        float percentage = (total*100)/300;
        System.out.println(percentage);
    }
}
