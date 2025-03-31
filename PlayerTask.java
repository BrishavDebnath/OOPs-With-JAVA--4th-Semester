public class PlayerTask {
    public static void main(String []args){
        Cricket_Player pl1=new Cricket_Player("Brishav",21,"Batsman");
        Hockey_Player pl2= new Hockey_Player("Kamlesh",21,"Striker");
        Football_Player pl3= new Football_Player("Sagar",19,"Defender");

        pl1.play();
        pl1.train();

        pl2.play();
        pl2.train();

        pl3.play();
        pl3.train();
    }
}

class Player{
    protected String name;
    protected int age;
    protected String position;
    public Player(String name,int age,String position){
        this.name=name;
        this.age=age;
        this.position=position;

    }
    void play(){
        System.out.println(name+"is playing as position "+position);
    }
    void train(){
        System.out.println(name+" is training!");
    }
}

class Cricket_Player extends Player{
    public Cricket_Player(String name,int age, String position){
        super(name,age,position);
    }
    @Override
    public void play(){
        System.out.println(name+" is playing Cricket as position "+position);
    }
}

class Hockey_Player extends Player{
    public Hockey_Player(String name,int age, String position){
        super(name,age,position);
    }
    @Override
    public void play(){
        System.out.println(name+" is playing Hockey as position "+position);
    }
}

class Football_Player extends Player{
    public Football_Player(String name,int age, String position){
        super(name,age,position);
    }
    @Override
    public void play(){
        System.out.println(name+" is playing Football as position "+position);
    }
}





