import java.util.Scanner;
public class ArrayNumCount {
    public static void main(String args[]){
        Scanner myobj= new Scanner(System.in);
       int [] arr={2,1,3,2,3,1,4,2,4,5,5,3};
       int x=arr.length;
       int count=0;
       System.out.println("Enter your Number:");
       int num= myobj.nextInt();
       for (int i=0; i<x; i++){
        if (arr[i]==num){
            count=count+1;
        }
       }
       System.out.println("Count:"+count);
           
    }
}
