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
			//�Ƿ��Ǿ���·��
			System.out.println(f.isAbsolute());
			//��ȡ���·��
			System.out.println(f.getPath());
			//��ȡ����·��
			System.out.println(f.getAbsolutePath());
			//��ȡ�ļ���
			System.out.println(f.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
