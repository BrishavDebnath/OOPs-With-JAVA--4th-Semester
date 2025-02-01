import java.util.Scanner;
public class PositiveNegative {
    public static void main(String []args){
        
     // Taking input from the user...
     Scanner myobj= new Scanner(System.in);
     System.out.println("Enter a integer:");
     int num = myobj.nextInt();
     

     // Using if-else logic we determine whether the number entered is positive, negative or zero...
     if (num>0){
        System.out.println("It is a Positive Integer!");

     }
     else if (num<0){
        System.out.println("It is a Negative Integer!");

     }
     else {
        System.out.println("The number is Zero.");
     }
    }
}
