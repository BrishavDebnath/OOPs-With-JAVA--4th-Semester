import java.util.Scanner;
public class CallCharges {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter duration:");
        double duration=obj.nextDouble();
        System.out.println("Enter Call type(1-Ordinary, 2-Lightning, 3-Emergency):");
        int type=obj.nextInt();

        Calls Call;

        switch (type) {
            case 1:
                Call = new Ordinary(duration);
                break;
            case 2:
                Call = new Lightning(duration);
                break;
            case 3:
                Call = new Emergency(duration);
                break;
            default:
                System.out.println("Invalid call type selected.");
                return;
        }
        
        System.out.println("Total charge: $" + Call.computecost());
        obj.close();


        
    }
    
}

class Calls{
    protected double duration;
    protected double ordinaryrate=3;
    protected double lightningrate=5;
    protected double emergencyrate=9;
    public Calls(double duration){
        this.duration=duration;
    }

    public double computecost(){
        return 0;
    }
}

class Ordinary extends Calls{
    public Ordinary(double duration){
        super(duration);
    }
    @Override
    public double computecost(){
        return duration*ordinaryrate;
    }

}

class Emergency extends Calls{
    public Emergency(double duration){
        super(duration);
    }
    @Override
    public double computecost(){
        return duration*emergencyrate;
    }

}

class Lightning extends Calls{
    public Lightning(double duration){
        super(duration);
    }
    @Override
    public double computecost(){
        return duration*lightningrate;
    }

}

