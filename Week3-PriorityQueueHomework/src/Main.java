import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //add the values from the scanner to this list
        List<String> events = new ArrayList<>();
        System.out.println("Enter  event size: ");
        int listSize = Integer.parseInt(scan.nextLine()); //get entered list size

        while(listSize>0){ // while list size is bigger than zero
            System.out.println("ENTER: (Name - cgpa - id) or SERVED \n ");
            String event = scan.nextLine(); //enter Student or type SERVED
            events.add(event); // add entered string to list

            --listSize;
        }

        // this is Priorities.class's static method. Methed returns Student List.
        List<Student> students = Priorities.getStudents(events);

        if(students.isEmpty()) // if list is empty
            System.out.println("EMPTY");
        else{
            for(Student student : students){  // print student list
                System.out.println(student.getName());
            }
        }



    }
}
