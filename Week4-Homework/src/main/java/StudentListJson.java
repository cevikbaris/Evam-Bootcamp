import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentListJson {

    public static List<Student> getStudentList() throws IOException {
        //jackson.databind
          ObjectMapper mapper = new ObjectMapper();
          List<Student> studentList = null;
          String fileName = "C:\\Users\\bar1s\\IdeaProjects\\Week4-Homework\\src\\main\\java\\student.json"; //json path

          // Json dosyasını oku ve stringe dönüştür.
          String stringJson=new String(Files.readAllBytes(Paths.get(fileName)));

          //json dosyasını listeye dönüştür. jackson-databind sayesinde aşşağıdaki methodu kullanabildik.
        //parantez içindeki 2. parametrede json değerini listeye dönüştürmek için kullandık.
          studentList=mapper.readValue(stringJson,
                        mapper.getTypeFactory().constructCollectionType(List.class, Student.class));

          //json dan veriler okundu mu bunu kontrol eden static bir değişken
          ProcessController.isReaded=true;
          //okunan json listesini dön
          return studentList;
      }

}
