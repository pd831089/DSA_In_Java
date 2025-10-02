package Logic_Java.com;

import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {

//        Get, Set, Clear, Update

        Scanner scan = new Scanner(System.in);
//        System.out.println("Please Enter a Number: ");
//        int n = scan.nextInt();
//        System.out.println("Please Enter a Position of a bit: ");
//        int pos = scan.nextInt();
//        System.out.println("Please Enter the Operation: ");
//        int opt = scan.nextInt();

        System.out.println("Please Enter a Binary number: ");
        String binary = scan.nextLine();


//        getBit(n);
//        setBit(n, pos);
//        clearBit(n, pos);
//        updateBit(n, pos, opt);
//        checkBitIsPowerOfTwo(n);
//        taggleAPossition(n, pos);
//        countTheBinaryNumber(n);
//        decimalToBinary(n);
        binaryToDecimal(binary);

    }

    public static void binaryToDecimal(String binary) {
        int decimal = 0;
        int pow = 0;
        for(int i=binary.length()-1; i>=0; i--){
            char ch = binary.charAt(i);
            if(ch == '1'){
                decimal += Math.pow(2, pow);
            }
            pow++;
        }
        System.out.println("The decimal value is: " + decimal);
    }

    public static void decimalToBinary(int n) {
        String so = "";
        while(n>0){
            int rem = n%2;
            so = rem + so;
            n = n /2;
        }
        System.out.println(so);
    }

    public static void countTheBinaryNumber(int n) {

        int count =0;
        while (n>0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);

    }

    public static void taggleAPossition(int n, int pos) {

        int bM = 1<<pos;
        int res = n ^ pos;
        System.out.println(res);

    }

    public static void checkBitIsPowerOfTwo(int n) {

        if(n<=0){
            System.out.println("The number is not a power");
        } else {
            int res = n & (n - 1);
            if( res == 0){
                System.out.println("The number is power: ");
            }
            else {
                System.out.println("The number is not a power: ");
            }
        }

    }

    public static void updateBit(int n, int pos, int opt) {

        int bM = 1<<pos;
        if(opt == 1){
//            set
            int newNumber = bM | n;
            System.out.println(newNumber);
        } else {
//              Clear
            int newBM = ~(bM);
            int newNumber = newBM & n;
            System.out.println(newNumber);
        }

    }

    public static void clearBit(int n, int pos) {

        int bm = 1<<pos;
        int nBM = ~(bm);
        int newNumber = nBM & n;
        System.out.println(newNumber);

    }

    public static void setBit(int n, int pos) {
        int bm = 1<<pos;
        int newNumber = bm | n;
        System.out.println(newNumber);
    }

    public static void getBit(int n) {
        int pos = 2;
        int bitmask = 1<<pos;
        if((bitmask & n) == 0){
            System.out.println("The bitmask is Zero: ");
        } else {
            System.out.println("The bitmask is One");
        }

    }
}
