package example6;

import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("What is your current age? ");
        int age = input.nextInt();

        System.out.print("At what age would you like to retire? ");
        int old = input.nextInt();

        int retire = old - age;

        int tireear = year + retire;

        System.out.println("You have "+retire+" years left until you can retire.");
        System.out.println("It's "+year+" so you can retire in "+tireear+".");



    }
}
