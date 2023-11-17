import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int a;
        System.out.println("Copy png file");
        try{
            FileInputStream fileInputStream = new FileInputStream("png.png");
            FileOutputStream fileOutputStream = new FileOutputStream("png2.png");

            a = fileInputStream.read();
            while (a!=-1){
                fileOutputStream.write(a);
                a = fileInputStream.read();
            }
            fileOutputStream.close();
            fileInputStream.close();
            System.out.println("File is copied");
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
