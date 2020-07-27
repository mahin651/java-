import java.util.*;
public class swap{

     public static void main(String []args){
          Scanner sc = new Scanner(System.in);
          System.out.println("enter first number");
          int x = sc.nextInt();
          System.out.println("enter second number");
          int y = sc.nextInt();
                  System.out.println("before swaping of numbers"+" "+x+" " +y);
                  x=x+y;
                  y=x-y;
                  x=x-y;
                System.out.println("after swaping of numbers"+" "+x+" " +y);



     }
}
