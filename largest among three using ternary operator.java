
import java.util.Scanner;
public class largestofthree
{
    public static void main(String[] args)
    {
        int x,y,z,max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter three numbers to be compared:");
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
         max = (x > y) ?(x>z ? x :z) :(y>z ? y :z);

        System.out.print("Number gratter among three is"+" "+max);


    }
}



