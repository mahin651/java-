import java.util.Scanner;
public class reversedigit
{
    public static void main(String[] args)
    {
        int n,r=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number to be reversed:");
        n = s.nextInt();
while (n != 0) {
 r = r * 10;
r = r + n%10;
n = n/10;}

        System.out.print("Number after reversed:"+r);


    }
}
