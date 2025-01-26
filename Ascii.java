import java.util.*;
public class Ascii {
    public static void main(String[] arags){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char character=sc.next().charAt(0);
        int Asciivalue=(int)character;
        System.out.println("The ASCII value of "+character+" is "+Asciivalue);
    }
    
}
