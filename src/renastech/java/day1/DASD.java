package renastech.java.day1;

public class DASD


{


    public static void main(String[] args) {


        String amount = "a";//amount of pesticide to be applied
        int not = 15; //number of trees
        int aol = 22; //amount of land
        String n = "Consult to specialist";


        String aop = "the amount of pesticide should be  '" + amount + "'";


        if((not>10) || (aol>3)) {
            amount = "A";

        }


        if ((not > 15) || (aol > 5)) {
            amount = "B";
        }


        if ((not > 18) || (aol > 7)){
            amount = "C";
        } else {
            amount=n;

        }
        System.out.println(aop);
    }







}
