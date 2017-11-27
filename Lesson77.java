package Next;
import java.io.File;

public class Lesson77 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\andrewdiesel\\Desktop\\file.txt");

        if(file.exists())
            System.out.println("File " + file.getName() + " exists");
        else
            System.out.println("File " + file.getName() + " does not exist");

    }


}
