package Next;
import java.util.*;
public class Lesson78 {
    public static void main(String[] args) {

       final Formatter file;

       try {

           file = new Formatter("C:\\bunny.txt");
           System.out.println("You've just created a file");

       }catch (Exception i){
           System.out.println("It dozent goes");

       }
    }
}
