interface MyInterface
{
   
   public void function1();
   public void function2();
}
 public class Demo implements MyInterface
{
  
   public void  function1()
   {
	System.out.println("Iam in function1(implementing interface with class)");
   }
   public void function2()
   {
	System.out.println("I am in function2 implementing interface with class)");
   }
   public static void main(String arg[])
   {
	MyInterface obj = new Demo();
	obj.function1();
	obj.function2();
   }
}
