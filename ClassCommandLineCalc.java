

public class ClassCommandLineCalc {
    public static void main(String []args){
       // Taking inputs from the command line for the calculator...
       int var1=Integer.parseInt(args[0]);
       int var2=Integer.parseInt(args[2]);
       
       // Taking the operation to be performed as input from the command line...
       String var = args[1];
       String mul="^*";


       // Calculating the output based on operation requested by the user and displaying it...
       if (var.equals("+")){
        System.out.println(var1+var2);
       }
       else if (var.equals("^*")){
        System.out.println(var1 * var2);
       }
       else if (var.equals("-")) {
        System.out.println(var1-var2);
       }
       else {
        System.out.print(var1/var2);
       }

    }
}
