
public class SimpleInterest {
    public static void main(String[] args){
        float principal=Float.parseFloat(args[0]);
        float rate=Float.parseFloat(args[1]);
        float time=Float.parseFloat(args[2]);
        System.out.println("Welcome! This Program calculates Simple Interest!");
        float si=(principal*rate*time)*0.01f;
        System.out.println("The Simple Interest is:"+si);
    }
    
}
