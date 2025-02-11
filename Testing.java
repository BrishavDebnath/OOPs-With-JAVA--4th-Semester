public class Testing {
    void show(long a){
        System.out.println("long method.");

    }
    void show(float a){
        System.out.println(" Float method");
    }
    public static void main(String []args){
        Testing obj1= new Testing();
        obj1.show('a');
    }
    
}
