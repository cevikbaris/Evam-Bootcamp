public class Main {

    public static void main(String[] args) {

        //Okuma ve ekrana yazdırma için 2 tane thread oluşturdum.
        Thread readingThread = new Thread(new ReadJson());
        Thread writingThread = new Thread(new WriteJson());
        //threadleri çalıştırdım

        writingThread.run();
        readingThread.run();
    }
}
