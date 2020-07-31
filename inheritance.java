import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class parent
{ 
    public void print() 
    { 
        System.out.println("parent class"); 
    } 
} 
  
class child extends parent
{ 
    public void display() 
    { 
        System.out.println("child class"); 
    } 
} 
public class Main 
{ 
    public static void main(String[] args) 
    { 
        child g = new child(); 
        g.print(); 
        g.display(); 
        g.print(); 
    } 
} 
