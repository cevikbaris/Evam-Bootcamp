import java.io.IOException;
import java.util.*;

public class ReadJson implements Runnable  {

    //json daki liste gelecek
    public static List<Student> studentList;

    @Override
    public void run() {
        try{
            System.out.println("Reading thread is working");
            Thread.sleep(3000);

            //json dosyasını oku- StudentListJson classı içerisindeki static method 'u kullandım
            studentList = StudentListJson.getStudentList();

        } catch (IOException | InterruptedException e) { //thread.sleep için | getStudentList için
            e.printStackTrace();
        }
    }

}
