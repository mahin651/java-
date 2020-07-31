abstract class demo{
   public abstract void display();
}
//Dog class extends Animal class
public class print extends demo{

   public void display(){
	System.out.println("demonstration of abstract class");
   }
   public static void main(String args[]){
	print obj = new print();
	obj.display();
   }
}
