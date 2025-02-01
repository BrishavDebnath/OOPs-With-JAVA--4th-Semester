import java.util.Scanner;
public class GreatestNum {
    public static void main (String[] args){
        
        // Taking inputs from the user...
        Scanner myobj= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=myobj.nextInt();
        System.out.println("Enter the second number:");
        int num2=myobj.nextInt();
        System.out.println("Enter the third number:");
        int num3=myobj.nextInt();
        

        // Using nested if-elses we determine the greatest of all three numbers...
        if (num1>num2){
            if (num1>num3){
                System.out.println(num1+" is the greatest number.");
            }
            else{
                System.out.println(num3 +" is the greatest number.");
            }
        }
        else{
            if (num2>num3){
                System.out.println(num2 +" is the greatest number.");
            }
            else{
                System.out.println(num3 +" is the greatest number.");
            }
        }

    }
}
