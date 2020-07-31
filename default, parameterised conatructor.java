public class Example{
   Example(){
      System.out.println("Default constructor");
   }
   
   Example(int i, int j){
      System.out.println("constructor with Two parameters i.e parameterised conatructor");
   }
  
   public static void main(String args[]){
      Example obj = new Example();


      Example obj2 = new Example(12, 12);

   }
}
