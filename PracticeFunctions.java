package Logic_Java.com;

import java.util.Scanner;

public class PracticeFunctions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = scan.nextInt();
//
//        System.out.println("Please enter array number: ");
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = scan.nextInt();
//        }

//        System.out.println("Please enter a First number: ");
//        int a = scan.nextInt();
//        System.out.println("Please enter a second number: ");
//        int b = scan.nextInt();



//        Factions calling
//        factorialNumber(n);
//        isPrime(n);
//        evenOrOdd(n);
//        numberTable(n);
//        averageNumber(arr, n);
//        sumOfAllOddNumbers(n);
//        greaterOfThoseTwo(a, b);
//        circumferenceOfACircle(n);
//        displayTheCountOfPositiveNegativeAndZeros(arr, n);
//        oneNumberRaisedToThePowerOfAnother(a, b);
//        greatestCommonDivisor(a, b);
        fibonacciSeries(n);


    }

    public static void fibonacciSeries(int n) {
        int first = 0, second = 1;
        int next;
        System.out.println("Fibbonaci series: ");
        for(int i=1; i<=n; i++){
            System.out.println(first + " ");

            next = first + second;
            first = second;
            second = next;

        }
    }

    public static void greatestCommonDivisor(int a, int b) {
        int min;
        int gcd =1;
        try {
            if(a < b){
                min = a;
            }
            else {
                min = b;
            }
            for(int i=1; i<=min; i++){
                if(a % i == 0 && b % i ==0){
                    gcd = i;
                }
            }
            System.out.println("GCD of " + a + " and "+ b + " is: " + gcd);
        } catch (Exception e) {
            System.out.println("Please enter other number beside zero: ");
        }
    }

    public static void oneNumberRaisedToThePowerOfAnother(int a, int b) {
        double power = Math.pow(a,b);
        System.out.println(power);
    }

    public static void displayTheCountOfPositiveNegativeAndZeros(int[] arr, int n) {
        int zero = 0;
        int positive = 0;
        int negative = 0;
        for(int num : arr){
            if(num == 0){
                zero++;
            } else if (num > 0) {
                positive++;
            }
            else {
                negative++;
            }
        }
        System.out.println("Zero Entered: "+zero+"\nPositive number Enterd: "+positive+"\nNegative Number Entered: "+negative);
    }

    public static void circumferenceOfACircle(int n) {
        double area = 2 * Math.PI * n;
        System.out.println("Area of a circle is: "+ area);
    }

    public static void greaterOfThoseTwo(int a, int b) {
        if(a > b)
            System.out.println(a + " Is a greater number then " + b);
        else
            System.out.println(b + " Is a greater number then " + a);
    }

    public static void sumOfAllOddNumbers(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("The sum of all Odd no is: " + sum);
        return;
    }

    public static void averageNumber(int[] arr, int n) {
        int sum = 0;
        for(int i=0; i<n; i++){
            sum +=arr[i];
        }
        System.out.println("The average number is: "+sum/n);
    }


    public static void numberTable(int n) {
        int mul = 1;
        for(int i=1; i<=10; i++){
            mul = n * i;
            System.out.println(n +" * " + i + " = " + mul);
        }
        return;
    }

    public static void evenOrOdd(int n) {
        if(n % 2 == 0)
            System.out.println("The number is Even");
        else
            System.out.println("The number is Odd");
    }

    public static void isPrime(int n) {
        if(n <= 1){
            System.out.println("Please enter a number greater then one");
            return;
        }
         boolean isprime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                isprime = false;
                break;
            }
        }
        if(isprime)
            System.out.println("Is a prime number");
        else
            System.out.println("Not a prime number");
    }

    public static void factorialNumber(int n){
        int fact = 1;
        if (n < 1) {
            System.out.println("Invalide Number, Please enter a number greater then one");
            return;
        }

        for (int i = n; i >= 1; i--) {
            fact = fact * i;
            System.out.print(fact + ", ");
        }
        System.out.println(fact);
        return;
    }






}
