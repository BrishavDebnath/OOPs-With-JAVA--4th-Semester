
//package Q;
import P.A;

public class B extends A {
    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();
        obj.publicmethod();
        // obj.defaultmethod();
        obj2.protectedmethod();
        // obj.privatemethod();
        obj.publicaccess();
    }

}
