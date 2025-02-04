public class CalculateAreaOverloading {
    final float pi=3.14f;
    float Area(int a){
        return pi*a*a;
    }
    float Area(float length, int breadth){
        return (length*breadth);
    }
    float Area(int base, float height){
        return (base*height)*0.5f;    
    }
    
    public static void main(String []args){
        CalculateAreaOverloading obj =new CalculateAreaOverloading();
        System.out.println("Area of a circle with radius 6:"+ obj.Area(6));
        System.out.println("Area of a rectangle with length=10 and breadth=15:"+obj.Area(10.0f,15));
        System.out.println("Area of a Triangle with base=10 and height=15:"+obj.Area(10,15.0f));
    }
}
