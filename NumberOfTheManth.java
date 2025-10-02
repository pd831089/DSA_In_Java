package Logic_Java.com;

import java.util.Scanner;

public class NumberOfTheManth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a month number: ");
        int mnum = scan.nextInt();
        month(mnum);
    }

    public static void month(int mnum){
        switch (mnum){
            case 1:
                System.out.println("Janvery");
                break;
            case 2:
                System.out.println("Febravery");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Augast");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Actobore");
                break;
            case 11:
                System.out.println("Nuvamber");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number: Please enter equal to 12 or below 12: ");
                break;
        }
    }
}
