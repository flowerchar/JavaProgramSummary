package IOStream.file;

import java.io.*;

public class FileOutputDemo {

    public static void main(String[] args) {
        FileOutputStream fos;
        FileInputStream fis;
        try {
            fos = new FileOutputStream("flowerchar.txt",true);
            fis = new FileInputStream("flowerchar.txt");

            fos.write(50);
            fos.write('a');

            System.out.println((char) fis.read());
            System.out.println(fis.read());

            fos.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
