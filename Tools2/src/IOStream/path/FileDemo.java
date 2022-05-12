package IOStream.path;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File f1=new File("d:\\flowerchar\\java\\thread\\thread.txt");
		System.out.println(f1.exists());
		File f=new File("thread.txt");
		try {
			f.createNewFile();
			//是否是绝对路径
			System.out.println(f.isAbsolute());
			//获取相对路径
			System.out.println(f.getPath());
			//获取绝对路径
			System.out.println(f.getAbsolutePath());
			//获取文件名
			System.out.println(f.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
