import java.util.*;
public class Swap
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Before swapping the number:-" +x + ""+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping the number:-" +x +"" +y);
        
    }
}