package main;

import java.util.Locale;

public class Lancuchy {
    public static void main(String[] args) {
//        String str = "Radek:  kocha:  Kasię!";
        String str2 = "katarzyna";
        System.out.println(firstToUpperCase(str2));
//
//        System.out.println(str.length());
//        System.out.println(str.charAt(2));
//        System.out.println(str.equals(str2));
//        System.out.println(str.substring(2, 7));
//        System.out.println(str + str2);
//        System.out.println(str2.replace("Kat", "Z"));
//
//        String tab1[] = null;
//        String tab2[] = null;
//
//        tab1 = str.split(":");
//        tab2 = str.split(":", 2);
//
//
//        for (int x = 0; x < tab1.length; x++) {
//            System.out.println(tab1[x]);
//        }
//        System.out.println("-----");
//        for (int x = 0; x < tab2.length; x++) {
//            System.out.println(tab2[x]);
//        }
//        System.out.println("-----");
//        System.out.println(str.trim());
//
//        System.out.println("-----");
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
    }
    public static  String firstToUpperCase(String str2) {
        String newStr = null;

        String first = String.valueOf(str2.charAt(0)).toUpperCase();
        String rest = str2.substring(1);
        newStr = first.concat(rest);
        System.out.println("-----");
        return  newStr;

    }
}