
class A {

    static void show() {

        System.out.println("A's show");

    }

}

class B extends A {

    static void show() {

        System.out.println("B's show");

    }

}

public class Main {

    public static void main(String args[]) {

        A obj = new B();
        /***
         * static void show() {
         * 
         * System.out.println("B2's show");
         * 
         * }
         * 
         * obj.show();
         * 
         * }
         ***/

    }
}
