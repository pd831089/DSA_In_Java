package Logic_Java.com;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = scan.nextInt();


//        rectanglePattern(n);
//        hollowRectangle(n);
//        halfPyramid(n);
//        invertedHalfPyramid(n);
//        invertedHalfPyramidRotatedBy180Deg(n);
//        halfPyramidWithNumber(n);
//        invertedHalfPyramidWithNumber(n);
//        floydsTriangle(n);
//        pr01Triangle(n);
//        solidRhombus(n);
//        numberPyramid(n);
//        palindromicnumberpyramid(n);
//        butterflyPattern(n);
//        diamondPattern(n);
//        hollowButterfly(n);
//        hollowRhombus(n);
//        PascalsTriangle(n);
//        invertedHalfPyramidWithSameNumber(n);





    }

    public static void invertedHalfPyramidWithSameNumber(int n) {
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(n-i+1);
            }
            System.out.println();
        }
    }

    public static void PascalsTriangle(int n) {
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n) {
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==n || j==n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowButterfly(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==1 || j==i || j==1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for(int k=1; k<=n-i; k++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                if(i==1 || j==i || j==1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(i==1 || j==i || j==1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for(int k=1; k<=n-i; k++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                if(i==1 || j==i || j==1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamondPattern(int n) {
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void butterflyPattern(int n) {
        for(int i=1; i<=n; i++){
            for(int s=1; s<=i; s++){
                System.out.print("*");
            }
            int space = 2 * (n-i);
            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int s=1; s<=i; s++){
                System.out.print("*");
            }
            int space = 2 * (n-i);
            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void palindromicnumberpyramid(int n) {
        for(int i=1; i<=n; i++){
            for(int k=0; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int l=2; l<=i; l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int n) {
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int n) {
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pr01Triangle(int n) {
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = j+i;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int n) {
        int count =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }


    public static void rectanglePattern(int n){
        for(int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowRectangle(int n){
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if (i==1 || j==1 || i==n || j==n) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramid(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(5);
        }
    }


    public static void invertedHalfPyramid(int n){
        for(int i=n; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramidRotatedBy180Deg(int n){
        for(int i=1; i<=n; i++){
            for (int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfPyramidWithNumber(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

   public static void invertedHalfPyramidWithNumber(int n){
        for(int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
   }




}
