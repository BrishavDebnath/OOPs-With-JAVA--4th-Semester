
public class AreaOfTriangle {
    public static void main (String[] args){
        float base = Float.parseFloat(args[0]);
        float height=Float.parseFloat(args[1]);
        System.out.println("Welcome! This Program calculates the area of a triangle!");
        float Area=0.5f*base*height;
        System.out.println("The Area of the triangle is:" + Area);
        
    }
}
