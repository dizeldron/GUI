package NextLevel;
import java.util.*;

public class Lesson17_GenericMethods {
    public static void main(String[] args) {
        Integer[] iArray = {1, 2, 3, 4, 44, 33, 77, 65};
        String[] sArray = {"Ace", "Stanley", "Bruce", "Carl"};
        Character [] cArray = {'a','5', '$', '^', '!'};
        Short [] shArray ={323,455,567,454,345,234,};
        printArray(iArray);
        printArray(sArray);
        printArray(cArray);
        System.out.println();
        printMe(iArray);
        printMe(sArray);
        printMe(cArray);
        printMe(shArray);


}
    public static void printArray(Integer[] i){
        for( Integer x : i)
            System.out.printf("%s ", x);
        System.out.println();

    }
    public static void printArray(Character[] i){
        for( Character x : i)
            System.out.printf("%s ", x);
        System.out.println();

    }

    public static void printArray(String[] i){
        for( String x : i)
            System.out.printf("%s ", x);
        System.out.println();}

        public static <T> void printMe(T[] x){
            for( T massive : x)
                System.out.printf("%s ", massive);
        System.out.println();


    }
}
