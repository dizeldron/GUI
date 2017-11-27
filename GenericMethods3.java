package NextLevel;
import java.util.*;
public class Lesson19_GenericMethods3 {
    public static void main(String[] args) {

        System.out.println(min(1, 34, 45));
        System.out.println(min("AWhat", "Bee", "EEEEEE"));
        System.out.println(min('d','y',','));


    }

    public static <T extends Comparable<T>> T min(T a, T b, T c){
        T m = a;
        if(b.compareTo(a) < 0)
            m = b;

        if(c.compareTo(m) < 0)
            m = c;
        return m;

    }
}
