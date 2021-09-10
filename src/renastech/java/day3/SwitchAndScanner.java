package renastech.java.day3;

import java.util.Scanner;

public class SwitchAndScanner {


    public static void main(String[] args) {
        String bank1 = "TD Bank";
        String bank2 = "BOA";
        String bank3 = "Capital one";
        String bank4 = "RBC";

        String condition;
        Scanner scan = new Scanner(System.in);

        condition = scan.nextLine();


        switch (condition){
            case "TD Bank":
                System.out.println(bank1);
                break;
            case "BOA":
                System.out.println(bank2);
                break;
            case "Capital one":
                System.out.println(bank3);
            case "RBC":
                System.out.println(bank4);
                break;
            default:
                System.out.println("No bank selected");
        }

        if(condition.equals(bank1)){
            System.out.println(bank1);
        }else if(condition.equals(bank2)){
            System.out.println(bank2);
        } else if (condition.equals(bank3)) {
            System.out.println(bank3);
        }else if (condition.equals(bank4)){
            System.out.println(bank4);
        }else {
            System.out.println("No bank selected");
        }




        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide us a number : ");

        int number = scanner.nextInt();

        System.out.println("You number is now "+ number * 5);




















    }













}
