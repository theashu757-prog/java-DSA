import java.util.HashSet;
import java.util.Iterator;

importjava .util.HashSet;
importjava .util.Iterator;
public class Hassing {
    public staic void main( string args[]){
        HashSet<Integer>set = new Hashset<>();

        //add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
         

         // size
         System.out.println(" the size of set is "  + set.size());

         // search
         if(set.contains(1)){
            System.out.println("present");
         }
         if (! set.contains(6)){
            System.out.println(absent);
         }

         // delete
         set.remove(1);
         if(! set.contains(1)){
            System.out.println(" absent");
         }

         // delete
         set.remove(1);
         if(!set.contains()){
            System.out.println("absent");

         }

         // print all element
         System.out.println(set);
    }
   //  iteration - Hashset does not have a order
   set.add(0);
   Iterator<E> it = set.iterator();
   while(it.hasnext()){
    System.out.println(it.next() + " ,");
   }
   System.out.println();

   // is empty
   if(!set.isEmpty());{
    System.out.println(" set is not empty ");
   }
   
   
    
}
