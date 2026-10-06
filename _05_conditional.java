
import java.util.Scanner;

public class _05_conditional {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
       System.out.println("Enter the Number:");
       int num = sc.nextInt();
       if (num % 2 == 0){
        System.out.println("Number is Even");  
       }
        else if(num<0){
        System.out.println("Number is negative");
       }
       else {
        System.out.println("Number is Odd");
        }

       }
    } 
  }  

