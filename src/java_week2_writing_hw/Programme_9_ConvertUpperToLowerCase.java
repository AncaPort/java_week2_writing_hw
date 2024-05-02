package java_week2_writing_hw;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lowercase
 */
public class Programme_9_ConvertUpperToLowerCase {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase String : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertUppercaseToLowercase(uppercase);
        //closing the scanner object
        scanner.close();
    }
    //conversion of Uppercase to Lower case method
    public void convertUppercaseToLowercase(String text){
        System.out.println("The Lowercase value is = "+text.toLowerCase());
    }
}
