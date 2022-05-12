package IOStream.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo1 {

    public static void main(String[] args) {
        //创建对象
        try {
            FileInputStream fis = new FileInputStream("flowerchar.txt");
//            int n  = fis.read();
//            while (n!=-1){
//                System.out.print((char) n);
//                n= fis.read();
//            }

            int n=0;
            while ((n=fis.read())!=-1){
                System.out.print((char) n);
            }

            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
