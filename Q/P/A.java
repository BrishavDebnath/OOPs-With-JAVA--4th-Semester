package P;

public class A {
    public void publicmethod(){
        System.out.println("Public Method!");

    }
    void defaultmethod(){
        System.out.println("Default Method!");
    }
    private void privatemethod(){
        System.out.println("Private Method!");
    }
    protected void protectedmethod(){
        System.out.println("Protected Method!");

    }

    public void publicaccess(){
        privatemethod();
    }
}
