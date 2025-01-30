import java.util.Scanner;
public class SumOfNum {
    public static void main(String args[]){
      Scanner myobj= new Scanner(System.in);
      System.out.println("Enter the first number:");
      int x = myobj.nextInt();
      System.out.println("Enter the second number:");
      int y = myobj.nextInt();
      if (x>y){
        System.out.println("The first number must be smaller than the second number. Enter correctly.");
        return;
      }
      int sum=0;
      for (int i=x;i<=y;i++){
        if (i%6==0 && i%9==0){
            sum=sum+i;
        }
      }
      System.out.println("Sum:"+sum);


    }
}
