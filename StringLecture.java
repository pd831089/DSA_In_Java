package Logic_Java.com;

import java.util.Scanner;

public class StringLecture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Please Enter a String: ");
//        String name = scan.nextLine();

//        Printing a name
//        System.out.println(name);
//        System.out.println(name.length());

//        charAt

//        for(int i=0; i<name.length(); i++){
//            System.out.println(name.charAt(i));
//        }


//        String compare
//        compareto checks for 3 cases 1. s1 > s2 then it return Positive values like +
//                                     2. s1 == s2 then it return 0
//                                     3. s1 < s2 the it return Negative values like -

//        String name1 = "Tony";
//        String name2 = "Tony";
//        if (name1.compareTo(name2) == 0){
//            System.out.println("Name is same from both side:");
//        } else {
//            System.out.println("Names are not equal");
//        }

//        if (name1 == name2){
//            System.out.println("Name is same from both side:");
//        } else {
//            System.out.println("Names are not equal");
//        }


//        if(new String("Tony") == new String("Tony")){
//            System.out.println("Name is same from both side:");
//        }else {
//            System.out.println("Names are not equal");
//        }


//        SubString

//        String sent = "My name is Tony";
//        System.out.println(sent.substring(11  /*starting Indix*/, sent.length() /*ending Index*/ ));


//        System.out.println("Please Enter a Size: ");
//        int size = scan.nextInt();
//        String[] ar = new String[size];
//        System.out.println("Please Enter you String: ");
//        for(int i=0; i<size; i++){
//            ar[i] = scan.next();
//        }


        String word = scan.next();


//      Functions Calling
//        arrayOfStrings(ar, size);
//        replaceEWithI(word);
        makeUserName(word);

    }

    public static void makeUserName(String word) {
        char ch;
        String res = "";
        for(int i=0; i<word.length(); i++){
            ch = word.charAt(i);
            if(ch == '@'){
                break;
            }
            res += ch;
        }
        System.out.println("The User naem is: "+ res);
    }

    public static void replaceEWithI(String word) {
        String res = "";
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch == 'e'){
                ch = 'i';
            }
            res += ch;
        }
        System.out.println(res);


    }

    public static void arrayOfStrings(String[] ar, int size) {
        int noLength = 0;

        for(int i=0; i<size; i++){
            noLength += ar[i].length();
        }
        System.out.println("The String Length is: " + noLength);


    }








}
