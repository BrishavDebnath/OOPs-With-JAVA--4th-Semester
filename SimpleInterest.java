import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner myobj=new Scanner(System.in);
        System.out.println("Welcome! This Program calculates Simple Interest!");
        System.out.println("Enter the Principal Amount:");
        float principal=myobj.nextFloat();
        System.out.println("Enter the Rate of Interest per year:");
        float rate=myobj.nextFloat();
        System.out.println("Enter the time in years:");
        float time=myobj.nextFloat();
        float si=(principal*rate*time)*0.01f;
        System.out.println("The Simple Interest is:"+si);
        myobj.close();
    }
    
}
