import java.util.Scanner;
public class PercentageCalculate {
    public static void main(String[]args){
       try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the marks of subject Math:");
        float math = sc.nextFloat();

        System.out.println("Enter the marks of subject Science:");
        float science = sc.nextFloat();

        System.out.println("Enter the marks of subject English:");
        float english = sc.nextFloat();

        System.out.println("Enter the marks of subject Social:");
        float social = sc.nextFloat();

        System.out.println("Enter the marks of subject Hindi:");
        float hindi = sc.nextFloat();

       if (math < 0 || math > 100 ||
                science < 0 || science > 100 ||
                english < 0 || english > 100 ||
                social < 0 || social > 100 ||
                hindi < 0 || hindi > 100) {

                System.out.println("Invalid Marks! Please enter marks between 0 and 100.");
                return;
            }

        float total = math + science  + english + social + hindi;
        float percentage = total/5;
        
        System.out.println("the Total Marks is:"+total);
        System.out.println("the Percentage is :"+percentage);
    }
  }
}
