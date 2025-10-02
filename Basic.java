package Logic_Java.com;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter First number: ");
        int a = scan.nextInt();
//        System.out.println("Please enter second number: ");
//        int b = scan.nextInt();

//        compare(a, b);
//        switchCaae(a);
//        sum(a);
//        maltiplication(a);
//        evenNumber(a);
        isPrime(a);



//        do {
//            System.out.println("Please Enter number 0 or 1: ");
//            int a = scan.nextInt();
//            if (a == 1) {
//                System.out.println("Please enter marks: ");
//                int marks = scan.nextInt();
//                if (marks >= 0 && marks <= 100) {
//                    if (marks >= 90)
//                        System.out.println("real Good");
//                    else if (marks >= 60 && marks <= 89)
//                        System.out.println("This is also Good");
//                    else
//                        System.out.println("This is Good as well");
//                }
//                else{
//                    System.out.println("Please Enter a marks betwenn 0 to 100");
//                }
//            }
//            if(a == 0) {
//                System.out.println("Good byeeeee");
//                break;
//            }
//        }while (true);



    }
    public static void compare(int a, int b){
        if(a == b)
            System.out.println("Equal");
        else if(a > b)
            System.out.println("A is greater ");
        else
            System.out.println("A is smaller");

    }

    public static void switchCaae(int a) {
        switch (a) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namasthe");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }
    }



    public static void sum(int a) {
        int sum =0;
        for(int i=0; i<=a; i++){
            sum +=i;
        }
        System.out.println(sum);
    }

    public static void maltiplication(int a){
        int mul = 0;
        for (int i=1; i<=10; i++) {
            mul = a*i;
            System.out.println(a + " * " + i + " = " + mul);
        }
        System.out.println();
        System.out.println(mul);
    }


    public static void evenNumber(int a){
        for(int i=1; i<=a; i++){
            if(i % 2 == 0){
                System.out.println("Even Number: " + i);
            }
        }
    }


    public static void isPrime(int a){
//        if(a <= 1)
//            System.out.println("Please a number greater then 1: ");
//
//
//            if(a % 2 == 0)
//                System.out.println("Not a Prime number: " + a);
//            else
//                System.out.println("It's a prime number: " + a);
    }

}
