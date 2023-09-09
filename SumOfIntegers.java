import java.io.*;
import java.util.*;
public class SumOfIntegers extends Object
{
    public static void main(String[]args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int x = Sc.nextInt();
        int y = Sc.nextInt();
        int z = x+y;
        System.out.println("Sum of"+x+"and"+y+"is"+z);
    }
}
