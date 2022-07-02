import java.io.IOException;
import java.util.List;

public class WriteJson implements Runnable{

    ReadJson jsonReader = new ReadJson();
    List<Student> studentList;
    @Override
    public void run() {

        try{
            System.out.println("Writing thread is working");
            Thread.sleep(3000);

            //json dosyasından değerler okundu mu eğer okunduysa ...
            if(ProcessController.isReaded==true) {

                //ReadJson sınıfı static ve onun içindeki studentlist'i çağırıyorum
                studentList = ReadJson.studentList;

                //Listedeki her elemanı ekrana yazdır
                if (!studentList.isEmpty())
                    studentList.stream().forEach(x -> System.out.println(x.toString()));
                else
                    return;

            }else{ // eğer henüz json okunmamışsa ReadJson'ı çalıştırıp okuma işlemini yapıp yazdırıyorum.
                //bu sayede  isReaded değişkeni true oluyor ve geri kalan işlem yukarıdaki if ksımıyla aynı
                // listeyi al ve yazdır.
                System.out.println("Reading operation not finished yet. ");
                new ReadJson().run();
                studentList = ReadJson.studentList;
                studentList.stream().forEach(x -> System.out.println(x.toString()));
                System.out.println("Reading operation completed.");


            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
