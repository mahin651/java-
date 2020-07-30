import java.io.*;
static class IMPLICT&EXPLICT
{
    public IMPLICT(){
    
      int i = 100;
      long l = i; 
      float f = l;  
      System.out.println("Int value "+i);
      System.out.println("Long value "+l);
      System.out.println("Float value "+f);
    }

    public EXPLICT()
    {
      double d = 100.04;
      long l = (long)d; 
      int i = (int)l; 
      System.out.println("Double value "+d);
      System.out.println("Long value "+l);
      System.out.println("Int value "+i);
    }
public void main(String[] args){
 IMPLICT&EXPLICT E = new  IMPLICT&EXPLICT();
E.IMPLICT();
E.EXPLICT();
}
}
