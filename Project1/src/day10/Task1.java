package day10;
import java.util.*;
 
class Fruits{   
    private String name;
    public void setName(String name){
        this.name=name;    
    }
    
    public String getName(){    
        return this.name;    
    }
} 
class FruitComparator implements Comparator{
 
    public int compare(Object obj1, Object obj2){    
 
        String fruitName = ((Fruits)obj1).getName();        
        String fruitName1 = ((Fruits)obj2).getName();
       
        return fruitName.compareTo(fruitName1);
    
    }
 
}
 
public class Task1 {
    
    public static void main(String args[])
    {
       
       
        Fruits fr[] = new Fruits[2];
       
       
        fr[0] = new Fruits();
        fr[0].setName("Mpple");
       
        fr[1] = new Fruits();
        fr[1].setName("Apple");

        System.out.println("Before sorting ");
       
        for(int i=0; i < fr.length; i++){
            System.out.println( "Fruits " + (i+1) +" name :: " + fr[i].getName() );
        }
        Arrays.sort(fr, new FruitComparator());
        System.out.println("\n after sorting ");
       
        for(int i=0; i < fr.length; i++){
            System.out.println( "Fruits name :: " + (i+1)  + fr[i].getName() );
        }
       
        

    
    }
 
}



