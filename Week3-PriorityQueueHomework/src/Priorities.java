import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {
      //sort students by grade name and id in order
    // firstly sort the grade then name then id
    // s1 s2 means student1 student2
    public static final Comparator<Student> studentComparator =
            (s1, s2) -> (Comparator.comparingDouble(Student::getCgpa).reversed())
                    .thenComparing(Student::getName)
                    .thenComparingInt(Student::getID)
                    .compare(s1, s2);


    //The Priorities class should implement the method List<Student> getStudents(List<String> events)
    // to process all the given events and return all the students yet to be served in the priority order.
    public static List< Student > getStudents(List < String > events) {

        List <Student> students = new ArrayList<Student>(); //it will return
        PriorityQueue<Student> priorityQueue =  //studentComparator is defined above
                new PriorityQueue<>(events.size(), studentComparator);  //event size entered value


        for (String event : events) {// for each event where event list
            String[] enteredStudent = event.split(" "); //divide string by spaces
            String request = enteredStudent[0];  //ENTER | SERVED - 0. INDEX
            if(request.equals("ENTER")){
                String name = enteredStudent[1];// NAME-1  CGPA-2  ID-3
                double cgpa = Double.parseDouble(enteredStudent[2]);
                int id = Integer.parseInt(enteredStudent[3]);
                Student student = new Student(name, cgpa, id );
                priorityQueue.add(student);

                //can be equal anything so i controlled with else if
            }else if(request.equals("SERVED")){
                priorityQueue.poll();// remove from queue so it will not list in output
            }
        }

        while (!priorityQueue.isEmpty()) { // while queue isn't empty add the get student from queue then add to list
            students.add(priorityQueue.poll());
        }
        return students; //List<Student> students

    }
}
