import java.util.Scanner;
public class GradeSheet {
    public static void main(String[] args) {
         Scanner myobj= new Scanner(System.in);
         System.out.println("Enter your name:");
         String Name=myobj.nextLine();
         System.out.println("Enter your SAP ID:");
         int sap=myobj.nextInt();
         System.out.println("Enter your marks for Physics, Chemistry and Mathematics:");
         int Physics=myobj.nextInt();
         int Chemistry=myobj.nextInt();
         int Mathematics=myobj.nextInt();
         System.out.println("----------------------------------------------------------");
         System.out.println("|\t\tName:"+Name+"\t\t      |");
         System.out.println("|\t\tSAP ID:"+sap+"\t\t     |");
         System.out.println("----------------------------------------------------------");
         System.out.println("|\tMaths:"+Mathematics+"\t  |");
         System.out.println("|\tPhysics:"+Physics+"\t    |");
         System.out.println("|\tChemistry:"+Chemistry+"\t|");
         System.out.println("----------------------------------------------------------");

    }
}
