package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("Md.Shafikul islam 77");
        String str = "java is Awesome ";
        String str3 = "java is best ";
        String name ="Md Shafikul";
        String lastname="islam";
        String str2=new String("java is Awesome");
        String str4=new String("java is Awesome");
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str==str3);
        System.out.println(str==str2);
        System.out.println(str2.equals(str4));
        System.out.println(str2.equalsIgnoreCase(str4));
        System.out.println(str.concat(str3));
        System.out.println(str + str3);
        System.out.println(str.startsWith("ja"));
        System.out.println(str.endsWith("e "));

        System.out.println(name.indexOf('i'));
        System.out.println(name.indexOf('S',7));
        System.out.println(name.lastIndexOf('l'));
        String middelName =name.substring(2);
        System.out.println(middelName);
        String middelName1 =name.substring(2,6);
        System.out.println(middelName1);
    }
}
