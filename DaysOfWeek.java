import java.util.Scanner;
public class DaysOfWeek {
    public static void main ( String [] args){

        // Taking input from the user...
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7:");
        int num=myobj.nextInt();

        // Using Switch-Case Logic we determine the day of the week based on input given and return as as output...
        switch (num) {
            case 1:
            System.out.println("Monday!");
            break;

            case 2:
            System.out.println("Tuesday!");
            break;

            case 3:
            System.out.println("Wednesday!");
            break;

            case 4:
            System.out.println("Thursday!");
            break;

            case 5:
            System.out.println("Friday!");
            break;

            case 6:
            System.out.println("Saturday!");
            break;

            case 7:
            System.out.println("Sunday!");
            break;

            default:
            System.out.println("Error! Enter a number from 1 to 7");
            break;

        }

       
    }
}
