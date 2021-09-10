package renastech.java.day5;

import java.util.Locale;

public class StringMethods {


    public static void main(String[] args) {


        char c = 'c';
        String s = "sssssss";


        //             012343
        String name = "erkAn";

        System.out.println("The original one is  " + name);


        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
         System.out.println(name.charAt(2));
         System.out.println(name.toUpperCase());
//
         System.out.println( name.contains("l"));

         if(name.contains("L")){
             System.out.println("Yes");
         }else {
             System.out.println("NO");
         }


         System.out.println(name.equals("Mike"));


         if(name.equals("Mike")){
             System.out.println("Yes");
         }else{
             System.out.println("NO");
         }


        System.out.println(" check if the names are equals "+name.equalsIgnoreCase("Erkan"));


         if(name.equalsIgnoreCase("ErKaN")){
             System.out.println("Yes");
         }else {
             System.out.println("NO");
         }


         String nums = "123456789";

         for(int i = nums.length()-1; i>=0; i--){

             System.out.print(nums.charAt(i));


         }




    }










}
