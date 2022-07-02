import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeworkAnswers {

    String s1 = "Welcome";
    String s2 = "Welcome";
    String s3 = "Welcome";
    //Three different objects are created.

    static String value = "<<code>>";

    public static void main(String[] args) {

        System.out.println("String value containing the defined value: " + checkValue(createStringArray(5)));
    }

    public static String checkValue(String[] arr){

        for (String str: arr) {
            if(str.contains(value))
                return str;
        }
        return "The searched value was not found.";
    }

    public static String[] createStringArray(int arrayLength){

        Scanner scanner = new Scanner(System.in);
        String[] array = new String[arrayLength];

        for(int i = 0; i<arrayLength; i++){
            System.out.println("Please enter the " + (i + 1) + " value");
            array[i] = scanner.nextLine();
        }
        return array;
    }
}
