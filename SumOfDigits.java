import java.util.Scanner;
public class SumOfDigits {
    public static void main(String []args){
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter a positive Integer:");
        int num= myobj.nextInt();
        int sum=0;
        while(num>0){
            int n=num%10;
            sum=sum+n;
            num=num/10;

        }
        System.out.println("The sum of the digits of the given integer is:"+sum);



    }
    
}
