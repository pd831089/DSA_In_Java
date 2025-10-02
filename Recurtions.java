package Logic_Java.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Recurtions {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please Enter a Number: ");
//        int n = scanner.nextInt();


//        itarationRecurtions(n);
//        reverseRecurtion(n);
//        sumRecurion(1, n, 0);
//        int res = factorialrecursion(n);
//        System.out.println(res);

//        int a = 0, b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        fibonacciRecursion(a, b, n - 2);

//        System.out.println("Please Enter number x: ");
//        int x = scanner.nextInt();
////        int res = powerRecursion(n, x);
//        int res = powerRecursionWithLog(x, n);
//        System.out.println(res);


//        recursion second shot


//        towerOfHonai(n, "S", "H", "D");
//        String str = "abcd";
//        printStringInReverse(str, str.length()-1);


//        String str = "abaacdaefaah";
//
//        findOccurence(str, 0, 'a');
//        int[] arr = {1, 3, 5};
//        System.out.println(arrayIsSortedOrNot(arr, 0));

//        String str = "axbcxxd";
//        moveTheX(str, 0, 0, "");


//        String str = "abbccda";
//        removeDublicates(str, 0, "");

        String str = "abc";
        sebSequences(str, 0, "");


//        String str = "aaa";
//        HashSet<String> set = new HashSet<>();
//        uniqueSubSequences(str, 0, "",set);


//        String str = "44";
//        printComb(str, 0, "");

//        String str = "abc";
//        possibleCombinationsOfString(str, "");


//        int n = 3, m = 3;
//        int paths = countPaths(0, 0, n, m);
//        System.out.println(paths);


//        int n = 4, m = 2;
//        System.out.println(placeTiles(n, m));


//        int n = 4;
//        System.out.println(callGuest(n));


//        int n = 3;
//        ArrayList<Integer> subSet = new ArrayList<>();
//        findSubset(n, subSet);








    }


    public static void findSubset(int n, ArrayList<Integer> subSet) {

        if(n == 0){
            printSubset(subSet);
            return;
        }

//        on it
        subSet.add(n);
        findSubset(n-1, subSet);

//        not on it
        subSet.remove(subSet.size()-1);
        findSubset(n-1, subSet);



    }

    public static void printSubset(ArrayList<Integer> subSet) {

        for(int i=-0; i<subSet.size(); i++){
            System.out.print(subSet.get(i) + " ");
        }
        System.out.println();

    }

    public static int callGuest(int n) {

        if(n <= 1){
            return 1;
        }

//        Single
        int ways1 = callGuest(n-1);

//        pair
        int ways2 = (n-1) * callGuest(n-2);

        return ways1 + ways2;


    }

    public static int placeTiles(int n, int m) {

        if(n == m){
            return 2;
        }

        if(n<m){
            return 1;
        }


//        Verticle
        int vertPlacement = placeTiles(n-m, m);

//        Horizontal
        int horiPlacement = placeTiles(n-1, m);

        return vertPlacement + horiPlacement;
    }

    public static int countPaths(int i, int j, int n, int m) {

        if(i == n || j == m){
            return 0;
        }

        if(i == n-1 && j == m-1){
            return 1;
        }

//        downwards
        int downPaths = countPaths(i+1, j, n, m);

//        move Right
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths + rightPaths;


    }

    public static void possibleCombinationsOfString(String str, String permutation) {

        if(str.isEmpty()){
            System.out.println(permutation);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            possibleCombinationsOfString(newStr, permutation+currChar);
        }

    }

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str, int idx, String combination) {

        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping  = keypad[currChar - '0'];


        for(int i=0; i<mapping.length(); i++){
            printComb(str, idx+1,combination+mapping.charAt(i));
        }

    }

    public static void uniqueSubSequences(String str, int idx, String newString, HashSet<String> set) {

        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);
//        to be
        uniqueSubSequences(str, idx+1, newString+currChar, set);

//        not to be
        uniqueSubSequences(str, idx+1, newString, set);



    }

    public static void sebSequences(String str, int idx, String newString) {

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);

//        to be
        sebSequences(str, idx+1, newString+currchar);
//        not to be
        sebSequences(str, idx+1, newString);
    }

    public static boolean[] map = new boolean[26];
    public static void removeDublicates(String str, int idx, String newString) {

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDublicates(str,idx+1, newString);
        }
        else {
            newString +=currChar;
            map[currChar - 'a'] = true;
            removeDublicates(str, idx+1,newString);
        }

    }

    public static void moveTheX(String str, int idx, int count, String newStr) {

        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChare = str.charAt(idx);
        if(currChare == 'x'){
            count++;
            moveTheX(str, idx+1, count, newStr);

        }
        else {
            newStr += currChare;
            moveTheX(str, idx+1, count, newStr);
        }


    }

    public static boolean arrayIsSortedOrNot(int[] arr, int idx) {

        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] >= arr[idx + 1]) {
            return false;
        }
        return arrayIsSortedOrNot(arr, idx+1);


    }


    public static int first = -1;
    public static int last  =  -1;



    public static void findOccurence(String str,int inx, char c) {

        if(inx == str.length()){
            System.out.println("The First Char is "+first+ "\nlast char is "+last);
            return;
        }
        char curChar = str.charAt(inx);
        if(curChar == c){
            if(first == -1){
                first = inx;
            }
            else {
                last = inx;
            }
        }
        findOccurence(str, inx +1, c);

    }

    public static void printStringInReverse(String str, int inx) {

        if(inx == 0){
            System.out.print(str.charAt(inx));
            return;
        }
        System.out.print(str.charAt(inx));
        printStringInReverse(str, inx-1);

    }

    private static void towerOfHonai(int n, String source, String helper, String dest) {
        if(n == 1){
            System.out.println("Transfer disk " +n+ " from " +source+ " to "+dest);
            return;
        }
        towerOfHonai(n-1, source, dest, helper);
        System.out.println("Transfer disk " +n+ " from " +source+ " to "+dest);
        towerOfHonai(n-1, helper, source, dest);
    }

    public static int powerRecursionWithLog(int x, int n) {

        if (n == 0 || x == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            return powerRecursionWithLog(x, n / 2) * powerRecursionWithLog(x, n / 2);
        } else {
            return powerRecursionWithLog(x, n/2) * powerRecursionWithLog(x, n/2) * x;
        }
    }


    public static int powerRecursion(int n, int x) {

        if(n == 0 || x == 0){
            return 1;
        }

        int xPowernm1 = powerRecursion(n-1, x);
        int xPower = x * xPowernm1;
        return xPower;
    }

    public static void fibonacciRecursion(int a, int b, int n) {
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibonacciRecursion(b, c, n-1);

    }

    public static int factorialrecursion(int n) {

        if(n == 1 || n == 0){
            return 1;
        }
        int fact_nm1 = factorialrecursion(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;

    }

    private static void sumRecurion(int i, int n, int sum) {

        if(i == n){

            sum += i;
            System.out.println("Sum os number is: " + sum);
            return;
        }

        sum+=i;
        sumRecurion(i+1, n, sum);

    }


    public static void reverseRecurtion(int n) {
        if(n == 6){
            return;
        }
        System.out.println(n);
        reverseRecurtion(n+1);
    }

    public static void itarationRecurtions(int n) {
        if( n == 0){
            return;
        }
        System.out.println("prajwal");
        itarationRecurtions(n-1);
    }











}
