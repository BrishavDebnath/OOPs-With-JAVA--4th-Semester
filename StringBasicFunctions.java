import java.util.Arrays;

public class StringBasicFunctions {
    public static void main(String[] args){
          String str="Hello";
          String str1="World!";
          System.out.println(str.length());
          System.out.println(str.charAt(0));
          System.out.println(str.substring(2));
          System.out.println(str.equals(str1));
          System.out.println(str.substring(0,1));
          System.out.println(str.contains("Hel"));
          System.out.println(str.replace('e','a'));
          System.out.println(str.toUpperCase());
          System.out.println(Arrays.toString("Java,Python".split(",")));
          System.out.println(str1.trim());
          System.out.println(str.equalsIgnoreCase(str1));

    }

}  