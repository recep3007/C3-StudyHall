package renastech.java.day6;

public class Loops {


    public static void main(String[] args) {


           // Start        Ending point     the side you want to go
        for ( int i =0;     i<0;            i++){

            System.out.println(i);

        }



//        int a = 0;
//
//        String s = "ERKAN";
//        String b = "ERKAN";
//
//
//        while (s.equals(b)){
//
//            System.out.println(b);
//
//
//        }


        for (int i = 0; i<10;  i++){

            if(i>5){
               // break;
                continue;
            }

            System.out.println(i);
        }
        String word="Renastech";
         int lengthOfWord= word.length();
         int lastIndexWord=word.length()-1;


         String reverse="";

                    //  8
         for (int i=lastIndexWord; i>=0; i-- ){
          //   reserve+=wordstr.charAt(i);

             reverse += word.charAt(i);
         }



        System.out.print(reverse);












    }






}
