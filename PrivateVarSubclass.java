public class PrivateVarSubclass {
    public static void main(String []args){
      Sub obj1=new Sub();
      obj1.display();
    }
   
    
}

class Super{
    private int var=10;
    public int fetch(){
        return var;
     }
        
}

class Sub extends Super{
    public void display(){
        //System.out.println("Private num"+var);  // Produces error.
        System.out.println("Private num:"+fetch());
    }
}
