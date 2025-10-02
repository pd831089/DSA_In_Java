package Logic_Java.com;

import java.util.Scanner;

public class SortingTechninque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter a Number: ");
        int n = scanner.nextInt();

        int[] ar = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = scanner.nextInt();
        }


//         Calling Functions
//        bubbleSorting(ar, n);
//        selectionSort(ar, n);
        insertionSort(ar, n);


    }

    public static void insertionSort(int[] ar, int n) {

        for(int i=1; i<ar.length; i++){
            int current = ar[i];
            int j = i-1;
            while(j>=0 && current < ar[j]){
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1] = current;
        }
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i] + " ");
        }

    }


    private static void selectionSort(int[] ar, int n) {

        for(int i=0; i<ar.length-1; i++){
            int smllest = i;
            for(int j=i+1; j<ar.length; j++){
                if(ar[smllest] < ar[j]){
                    smllest = j;
                }
            }
            int temp = ar[smllest];
            ar[smllest] = ar[i];
            ar[i] = temp;
        }
        for(int i=ar.length-1; i>=0; i--){
            System.out.print(ar[i] + " ");
        }

    }







    public static void bubbleSorting(int[] ar, int n) {
        for (int i = 0; i < ar.length-1; i++) {

            for(int j=0; j<ar.length-i-1; j++){
                if(ar[j] > ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;

                }

            }

        }
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i] + " ");
        }

    }

}
