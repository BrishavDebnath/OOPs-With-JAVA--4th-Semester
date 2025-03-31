public class WorkerClass {
    public static void main(String []args){
        DailyWorker a1=new DailyWorker("Brishav",100);
        SalariedWorker a2= new SalariedWorker("Kamlesh",50);
        System.out.println(a1.displayname()+" earns:"+a1.computepay(50));
        System.out.println(a2.displayname()+" earns:"+a2.computepay(50));
    }

    
}

class Worker{
    protected String name;
    protected int  salaryrate;
    public Worker(String name,int salaryrate){
        this.name=name;
        this.salaryrate=salaryrate;
    }
    public String displayname(){
        return name;
    }

    public int computepay(int hours){
        return 0;
    }
}

class DailyWorker extends Worker{
    public DailyWorker(String name,int salaryrate){
        super(name,salaryrate);
    }

    @Override
    public int computepay(int hours){
        return salaryrate *(hours/8);

    }
}

class SalariedWorker extends Worker{
    public SalariedWorker(String name, int salaryrate){
        super(name,salaryrate);
    }
    @Override
    public int computepay(int hours){
        return salaryrate*hours;
    }
}


