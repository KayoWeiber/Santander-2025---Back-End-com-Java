import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        test();

    }
    private static void test(){
        new Throwable();

        new Exception(); new OutOfMemoryError();
        new RuntimeException(); new FileNotFoundException();
    }
}
