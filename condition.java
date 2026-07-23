import java.util.*;
public class condition {
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
       // if ( age >18){
      //      System.out.println("Adult");
    //    }
    //    else{
     //       System.out.println("Not adult");
    //    }
      switch(button){
        case 1 : System.out.println("Namste");
        break;
        case 2 : System.out.println("hello");
        break;
        case 3: System.out.println("bonjouur");
        break;
        default : System.out.println("invalid button");
      }  

    }
    
}
