public class Pattern {
    public static void main(String []args){
        int n=1;
        for (int i=1;i<=5;i++){
            if (i%2==0){
              System.out.println("#".repeat(n));
            }
            else{
                System.out.println("?".repeat(n));
            }
            n=n+2;
        }
    }
    
}
