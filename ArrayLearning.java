package Logic_Java.com;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLearning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        int n = scan.nextInt();

        System.out.println("Please Enter a number: ");
        int m = scan.nextInt();
//
        int[][] ar1 = new int[n][m];
        System.out.println("Please Enter a Array Elements: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ar1[i][j] = scan.nextInt();
            }
        }
//
//
//        System.out.println("Please Enter a searching value: ");
//        int x = scan.nextInt();

//        System.out.println("Please Enter a multi names here: ");
//        String[] name = new String[n];
//        for(int i=0; i<n; i++){
//            name[i] = scan.next();
//        }




//        Function Calling
//        searchingArray(ar,n,x);
//        arrayOfNames(name, n);
//        maximumAndMinimumNumber(ar, n);
//        arraySorted(ar);

//        Two D Array
//        twoDArray(ar1, n, m);
//        findTheNumberTwoDArray(ar1, n, m, x);
        spiralOrderMatrix(ar1, n, m);






    }

    public static void spiralOrderMatrix(int[][] ar1, int n, int m) {
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        while(rowStart <= rowEnd && colStart <= colEnd) {
            //1
            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(ar1[rowStart][col] + " ");
            }
            rowStart++;


            //2
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(ar1[row][colEnd] +" ");
            }
            colEnd--;


            //3
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(ar1[rowEnd][col] + " ");
            }
            rowEnd--;

            //4
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(ar1[row][colStart] + " ");
            }
            colStart++;


            System.out.println();
            }




        }

    public static void findTheNumberTwoDArray(int[][] ar1, int n, int m, int x) {

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(ar1[i][j] == x){
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }

    public static void twoDArray(int[][] ar1, int n, int m) {
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(ar1[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static void arraySorted(int[] ar) {
        boolean isAcending = true;
        for(int i=0; i<ar.length-1; i++){
            if(ar[i] > ar[i+1]){
                isAcending = false;
            }
        }
        if (isAcending) {
            System.out.println("The Array is in Ascending order");
        }
        else {
            System.out.println("The Array is not in Ascending Order");
        }
    }


    public static void maximumAndMinimumNumber(int[] ar, int n) {
        int min = ar[0];
        int max = ar[0];
        for(int i=0; i<ar.length; i++){
            if(ar[i] < min){
                min = ar[i];
            }
            if(ar[i] > max){
                max = ar[i];
            }
        }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
    }

    public static void arrayOfNames(String[] name, int n) {
        for(String names : name){
            System.out.println(names);
        }
    }

    public static void searchingArray(int[] ar, int n, int x){
        for(int i=0; i<ar.length; i++){
            if(ar[i] == x){
                System.out.println("The Element is: "+i);
                break;
            }
        }
    }

}
