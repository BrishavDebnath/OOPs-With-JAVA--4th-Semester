
public class AreaOfTriangle {
    public static void main (String[] args){
        // Taking base as input from command line...
        float base = Float.parseFloat(args[0]);

        // Taking Height as input from the Command Line...
        float height=Float.parseFloat(args[1]);

        // Calculating the Area and displaying as output...
        System.out.println("Welcome! This Program calculates the area of a triangle!");
        float Area=0.5f*base*height;
        System.out.println("The Area of the triangle is:" + Area);
        
    }
}
