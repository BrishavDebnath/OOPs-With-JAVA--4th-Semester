public class PrimeNumbers {
    public static void main(String []args){
        System.out.println("The Prime Numbers from 1 to 1000 are:");
        System.out.print("2"+"\t"+"3"+"\t"+"5"+"\t"+"7");
        for (int i=11;i<=1000;i++){
            if ((i%2==0)||(i%3==0)||(i%5==0)||(i%7==0)){
                continue;
            }
            else{
                System.out.print("\t"+i);
            }
        }
    }
    
}
