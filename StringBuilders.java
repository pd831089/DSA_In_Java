package Logic_Java.com;

import java.util.Scanner;

public class StringBuilders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));


//        Set Char at index
        sb.setCharAt(0,'P');
        System.out.println(sb);

//        Inserting elements in string
        sb.insert(0,'S');
        System.out.println(sb);

        sb.insert(3,'n');
        System.out.println(sb);

//        Delete a char in the string

        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println(sb);

        System.out.println();

//        Foe the hello inserting only one element at a time

        StringBuilder bs1 = new StringBuilder("H");
        bs1.append('e');
        bs1.append('l');
        bs1.append('l');
        bs1.append('o');
        System.out.println(bs1+ " " + bs1.length());

        System.out.println();


        System.out.println("Please Enter a String that you want to Reverse:");
        StringBuilder str = new StringBuilder(scan.nextLine());
//        reverseAString(str);
//        palindromeOrNot(str);
//        removeAllVowels(str);
//        replaceAllSpaces(str);
//        capitalizeFirstLetter(str);
//        removeDuplicateCharacters(str);
        countCharactore(str);


    }

    public static void countCharactore(StringBuilder str) {
        char target = 'a';
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == target){
                count++;
            }
        }
        System.out.println(str + " " + count);
    }

    public static void removeDuplicateCharacters(StringBuilder str) {
        StringBuilder res = new StringBuilder();
        boolean[] seen = new boolean[256];
        for(char c : str.toString().toCharArray()){
            if(!seen[c]){
                seen[c]=true;
                res.append(c);
            }
        }
        System.out.println(res);
    }

    public static void capitalizeFirstLetter(StringBuilder str) {
        for (int i=0; i<str.length(); i++){
            if(i == 0 || str.charAt(i-1) == ' '){
                str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
        }
        System.out.println(str);
    }

    public static void replaceAllSpaces(StringBuilder str) {
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                str.setCharAt(i, '-');
            }
        }
        System.out.println(str);
    }

    public static void removeAllVowels(StringBuilder str) {
        String res = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ||
                    str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
                continue;
            }
            else {
                res += str.charAt(i);
            }
        }
        System.out.println(res);
    }

    public static void palindromeOrNot(StringBuilder str) {
        StringBuilder res = new StringBuilder(str);
        for(int i=0; i<str.length()/2; i++){

            int front = i;
            int back = res.length() - 1 -i;

            char frontChar = res.charAt(front);
            char backChar = res.charAt(back);

            res.setCharAt(front, backChar);
            res.setCharAt(back, frontChar);
        }

        if(res.toString().equals(str.toString())){
            System.out.println(res + " The String is Palindrome: ");
        }
        else {
            System.out.println(res + ": The String is not a Palindrome: ");
        }


    }


    public static void reverseAString(StringBuilder str){

//        str.reverse();
//        System.out.println(str);

        for(int i=0; i<str.length()/2; i++){
            int front = i;
            int back = str.length() -1 -i;

            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt(back,frontChar);
        }
        System.out.println(str);

    }
}
