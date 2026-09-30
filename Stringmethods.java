import java.util.Scanner;
public class Stringmethods{
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        //take input from user
        System.out.println("Enter the frist string:");
        String s1 = sc.nextLine();

        System.out.println("Enter the second string:");
        String s2 = sc.nextLine();
        //add both string 
        String s3 = s1 + " " + s2;
        System.out.println("Combined string is : " +s3);
        System.out.println("Length of string is:" +s3.length());
        System.out.println("Uppercase string is:" +s3.toUpperCase());
        System.out.println("Lowercase of string is:" +s3.toLowerCase());
        System.out.println("Trim of string is:" +s3.trim());
        System.out.println("Substring of string is:" +s3.substring(0,6));
        System.out.println("Replace of string is:" +s3.replace("T","L"));
        System.out.println("Start with of string is:" +s3.startsWith("NI"));
        System.out.println("End with of string is:" +s3.endsWith("AV"));
        System.out.println("Last index of string is:" +s3.lastIndexOf(s3));
        System.out.println("Length of string is:" +s3);


       }

    }
}