import java.util.Scanner;
public class eligiblevote {
   public static void main(String[] args) {
    try(Scanner sc = new Scanner (System.in)){
        System.out.println("Enter the age");
        int age = sc.nextInt();
       if(age>=18){
        System.out.println("He is eligible to vote");
       }
       else if(age>200){
        System.out.println("Enter the existing age");
       }
       else{
        System.out.println("He can not eligibleto vote");
       }

   } 
  }
}
