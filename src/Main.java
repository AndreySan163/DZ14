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

 import java.io.FileInputStream;
        import java.io.FileOutputStream;
        import java.io.IOException;

/* public class ByteCopyApp {
    public static void main(String[] args) {
        System.out.println("Copy png file");

        String sourceFilePath = "png.png";
        String destinationFilePath = "png2.png";

        try {
            copyFile(sourceFilePath, destinationFilePath);
            System.out.println("File is copied !");

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void copyFile(String sourceFilePath, String destinationFilePath) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(sourceFilePath);
             FileOutputStream outputStream = new FileOutputStream(destinationFilePath)) {


            int a;
            a = inputStream.read();
            while (a!=-1){
                outputStream.write(a);
                a = inputStream.read();
            }
        }
    }
}*/