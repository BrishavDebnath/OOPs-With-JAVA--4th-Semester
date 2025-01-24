

public class ClassCommandLineCalc {
    public static void main(String []args){
       int var1=Integer.parseInt(args[0]);
       int var2=Integer.parseInt(args[2]);

       String var = args[1];
       String mul="^*";
       
       if (var.equals("^+")){
        System.out.println(var1+var2);
       }
       else if (var.equals("+")){
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
