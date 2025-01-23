import java.util.Scanner;
public class AreaOfTriangle {
    public static void main (String[] args){
        Scanner myobj= new Scanner(System.in);
        System.out.println("Welcome! This Program calculates the area of a triangle!");
        System.out.println("Enter the Base of the triangle:");
        float base=myobj.nextFloat();
        System.out.println("Enter the Height of the triangle:");
        float height= myobj.nextFloat();
        float Area=0.5f*base*height;
        System.out.println("The Area of the triangle is:" + Area);
        myobj.close();
    }
}
