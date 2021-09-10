package renastech.java.day2;

public class IfElseConditions {


    public static void main(String[] args) {

        int a = 4;
        int b = 6;


        if(a>b)
        {

            if(a<b){

                if(a>b){
                    System.out.println("asfdadasfdsafsafd");
                }
                System.out.println("asfdadasfdsafsafd");
            }
            System.out.println("A is Greater then B");
        }
        else
        {

            if(a>b){
                System.out.println("B is Greater then A");
            }else {

            }



        }


        if(a>b){
            System.out.println("A is Greater then B");
        }else if(a<b) {
            System.out.println("B is Greater then A");
        }else {

        }




        // false
        if(a>b){
            System.out.println("A is Greater then B");
        }else if(a<b){  //false
            System.out.println("B is Greater then A");

        }else if(a>b){

            if(a<5){
                System.out.println("A smaller than 5");
            }else {
                System.out.println("A is Greater then B");
            }


        }else{

            System.out.println("Nothing is working");

        }





    }







}
