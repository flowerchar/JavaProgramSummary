package IOStream.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo2 {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("naulogo.png");
            FileOutputStream fos = new FileOutputStream("naulogo-copy.png");
            int n=0;
            byte[] b=new byte[1024];
            while ((n=fis.read(b))!=-1){
                fos.write(b, 0, n);
            }

            fis.close();
            fos.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
