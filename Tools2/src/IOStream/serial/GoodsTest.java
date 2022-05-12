package IOStream.serial;

import java.io.*;

public class GoodsTest {
    public static void main(String[] args) {
        Goods goods1 = new Goods("gd001", "电脑", 3000);
        try {
            FileOutputStream fos = new FileOutputStream("ser.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream("ser.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //写入文件
            oos.writeObject(goods1);
            oos.flush();
            //读取信息
            try {
                Goods goods = (Goods) ois.readObject();
                System.out.println(goods.toString());
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }
            fos.close();
            oos.close();
            ois.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
