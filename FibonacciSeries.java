import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String []args){
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter the number of terms to display:");
        int num=myobj.nextInt();
        int n=num-2;
        System.out.println("Fibonaaci Series:");
        System.out.print("0"+"\t"+"1");
        int a=0;
        int b=1;
        int sum=0;
        for(int i=0;i<n;i++){
           sum=a+b;
           System.out.print("\t"+sum);
           a=b;
           b=sum; 
        }


    }
    
}
