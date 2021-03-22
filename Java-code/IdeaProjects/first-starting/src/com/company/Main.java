package com.company;

import java.util.Locale;
import java.util.Arrays;

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
        
        char [] names=name.toCharArray();
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase(Locale.ROOT));
        
        String language = "java javascript kotlin php Ruby c C++";
        String [] lan = language.split(" ");
        System.out.println(Arrays.toString(lan));
        System.out.println(lan[3]);
        String language = "java javascript kotlin php Ruby c C++";

        StringTokenizer token = new StringTokenizer(language);
        while (token.hasMoreTokens()){
            System.out.println(token.nextToken());
            //   StringBuffer
         StringBuffer sb= new StringBuffer(language);
        System.out.println(sb.capacity());
       System.out.println(sb.length());

        StringBuffer stringBuffer= new StringBuffer("");
        stringBuffer.append("MD:");
        stringBuffer.append("Shafikul ");
        stringBuffer.append("islam");
        System.out.println(stringBuffer);

        StringBuffer sb2= new StringBuffer("java");
        System.out.println(sb2.reverse());
            StringBuffer buffer= new StringBuffer();
       String str ="Md.Shafikul islam ";
       long startB=System.currentTimeMillis();
       for(int i=0; i<10000; i++){
           buffer.append(str);
       }
       long endB =System.currentTimeMillis();
       System.out.println(endB - startB);
        System.out.println(buffer);
        System.out.println(endB - startB);
            
         
    }
}
    // Method Overloading in Java
    
    class Adder{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  
class TestOverloading1{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(11,11,11));  
}}  
