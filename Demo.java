package Logic_Java.com;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int n = scanner.nextInt();
        factoriel(n);
    }

    public static void factoriel(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact *i;
            System.out.println(fact);
        }
        System.out.println();
        System.out.println(fact);
    }

}
