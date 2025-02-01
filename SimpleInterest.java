
public class SimpleInterest {
    public static void main(String[] args){
        // Taking Inputs principal, rate and time from the command line to calculate Simple Interest...
        float principal=Float.parseFloat(args[0]);
        float rate=Float.parseFloat(args[1]);
        float time=Float.parseFloat(args[2]);

        // Calculating the Simple Interest and displaying it as output...
        System.out.println("Welcome! This Program calculates Simple Interest!");
        float si=(principal*rate*time)*0.01f;
        System.out.println("The Simple Interest is:"+si);
    }
    
}
