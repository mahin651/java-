class Superclass
{
   int num = 2000000;
}
public class Subclass extends Superclass
{

    int num = 1000000;
    void printNumber(){
    System.out.println("without super keyword: ");
	System.out.println(num);
	System.out.println("with use of super keyword: ");
	System.out.println(super.num);
	 }
    public static void main(String args[]){
	Subclass obj= new Subclass();
	obj.printNumber();	
    }
}
