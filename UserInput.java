package com.company;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       System.out.println("taking the user input");

        System.out.println("enter number one :");
        int a =sc.nextInt();

        System.out.println("enter number two :");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("the sum of these number is");
        System.out.println(sum);
       // boolean b1= sc.hasNextInt();
        //System.out.println(b1);
        //String str=sc.nextLine();//for one line print
        //System.out.println(str);
    }
}
