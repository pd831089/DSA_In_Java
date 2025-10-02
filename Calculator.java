package Logic_Java.com;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a First number: ");
        int a = scan.nextInt();
        System.out.println("Please enter a second number");
        int b = scan.nextInt();
        System.out.println("1. + \n2. - \n3. * \n4. /\n5. %\n6. Exit");
        System.out.println("Please enter a number: ");
        int num = scan.nextInt();
        calculate(a, b, num);


    }
    public static void calculate(int a, int b, int num){

            switch (num){
                case 1:
                    System.out.println("Add: " + (a+b));
                    break;
                case 2:
                    System.out.println("Sub: " + (a-b));
                    break;
                case 3:
                    System.out.println("mul: " + (a*b));
                    break;
                case 4:
                    System.out.println("dev: " + (a/b));
                    break;
                case 5:
                    System.out.println("mod: " + (a%b));
                case 6:
                    break;
                default:
                    System.out.println("Please enter a given number");
            }

    }
}
