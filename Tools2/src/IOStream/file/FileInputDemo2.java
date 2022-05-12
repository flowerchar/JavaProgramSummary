package IOStream.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo2 {

    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("flowerchar.txt");
            byte[] b = new byte[100];
            fis.read(b,0,5);
            // len?
            System.out.println((b));
            fis.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
