package Logic_Java.com;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pleas enter a number");
        int x = scan.nextInt();

        if(x % 2 == 0) {
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
