package Player;

import java.util.Scanner;

public class TestDemo {

	// �Ը�����Song���в���
	public void testSong() {
		Song song1 = new Song("s001", "�¶�����", "����Ѹ");
		Song song2 = new Song("s002", "Ұ����", "��ǧ��");
		Song song3 = new Song("s003", "��˹��֮��", "�Ź���");
		Song song4 = new Song("s003", "��˹��֮��", "�Ź���");
		System.out.println(song1);
		// ����song1��song3�����������Ƿ����r
		System.out.println("song1==song3?" + (song1.equals(song3)));
		System.out.println("song4==song3?" + (song4.equals(song3)));
		System.out.println(song3 == song4);

	}

	// �Բ����б���PlayList���в���
	public void testPlayList() {
		// ���弸��Song��Ķ�����ӵ������б���
		Song song1 = new Song("s001", "�¶�����", "����Ѹ");
		Song song2 = new Song("s002", "Ұ����", "��ǧ��");
		Song song3 = new Song("s003", "��˹��֮��", "�Ź���");
		Song song4 = new Song("s003", "��˹��֮��", "�Ź���");
		// ����һ��PlayList����
		PlayList mainPlayList = new PlayList("�������б�");
		mainPlayList.addToPlayList(song1);
		mainPlayList.addToPlayList(song2);
		mainPlayList.addToPlayList(song3);
		mainPlayList.addToPlayList(song4);
		// ��ʾ�����б������
		mainPlayList.displayAllSong();
		// ͨ��id��ѯ������Ϣ
		Song song = mainPlayList.searchSongById("s005");
		if (song != null) {
			System.out.println("����id��ѯ�ĸ�����ϢΪ��");
			System.out.println(song);
		} else {
			System.out.println("�ø��������ڣ�");
		}
		// ͨ�����Ʋ�ѯ������Ϣ
		song = null;
		song = mainPlayList.searchSongByName("Ұ����");
		if (song != null) {
			System.out.println("����name��ѯ�ĸ�����ϢΪ��");
			System.out.println(song);
		} else {
			System.out.println("�ø��������ڣ�");
		}
		// �޸ĸ�����Ϣ
		Song songUpdate = new Song("s005", "��˹��֮��", "����Ѹ");
		mainPlayList.updateSong("s003", songUpdate);
		mainPlayList.displayAllSong();
		// ɾ��������Ϣ
		mainPlayList.deleteSong("s005");
		mainPlayList.displayAllSong();

	}

	// ���Բ����б�����
	public void testPlayListCollection() {
		Song song1 = new Song("s001", "�¶�����", "����Ѹ");
		Song song2 = new Song("s002", "Ұ����", "��ǧ��");
		Song song3 = new Song("s003", "��˹��֮��", "�Ź���");
		// �����������б�
		PlayList mainPlayList = new PlayList("�������б�");
		// ��������ӵ��������б���
		mainPlayList.addToPlayList(song1);
		mainPlayList.addToPlayList(song2);
		mainPlayList.addToPlayList(song3);
		// ����һ���µĲ����б����������б�����Ӹ�������
		PlayList favouritePalyList = new PlayList("��ϲ���ĸ���");
		favouritePalyList.addToPlayList(mainPlayList.getMusicList().get(0));
		favouritePalyList.addToPlayList(mainPlayList.getMusicList().get(1));
		favouritePalyList.displayAllSong();
		// �����������б���ӵ������б�����
		PlayListCollection plc = new PlayListCollection();
		plc.addPlayList(mainPlayList);
		plc.addPlayList(favouritePalyList);
		plc.displayListName();
		// ���ݲ����б����ֲ�ѯ�����б���Ϣ������ʾ���и���
		PlayList playList = plc.searchPlayListByName("��ϲ���ĸ���");
		playList.displayAllSong();
		// ɾ�������б���Ϣ
		System.out.println("ɾ��ǰ��");
		plc.displayListName();
		plc.deletePlayList(favouritePalyList);
		System.out.println("ɾ����");
		plc.displayListName();
	}

	// ���˵�
	public void mainMenu() {
		System.out.println("***************************************");
		System.out.println("                 **���˵�**                      ");
		System.out.println("                 1--�����б����    ");
		System.out.println("                 2--����������    ");
		System.out.println("                 0--�˳�   ");
		System.out.println("***************************************");

	}

	// �����б����˵�
	public void playListMenu() {
		System.out.println("*******************************************************");
		System.out.println("                 **�����б����**    ");
		System.out.println("                 1--��������ӵ��������б�    ");
		System.out.println("                 2--��������ӵ���ͨ�����б�    ");
		System.out.println("                 3--ͨ������id��ѯ�����б��еĸ���    ");
		System.out.println("                 4--ͨ���������Ʋ�ѯ�����б��еĸ���    ");
		System.out.println("                 5--�޸Ĳ����б��еĸ���    ");
		System.out.println("                 6--ɾ�������б��еĸ���    ");
		System.out.println("                 7--��ʾ�����б��е����и���    ");
		System.out.println("                 9--������һ���˵�   ");
		System.out.println("*******************************************************");
	}

	// �������˵�
	public void playerMenu() {
		System.out.println("*******************************************************");
		System.out.println("                 **����������**    ");
		System.out.println("                 1--�򲥷�����Ӳ����б�    ");
		System.out.println("                 2--�Ӳ�����ɾ�������б�    ");
		System.out.println("                 3--ͨ�����ֲ�ѯ�����б���Ϣ    ");
		System.out.println("                 4--��ʾ���в����б�����    ");
		System.out.println("                 9--������һ���˵�   ");
		System.out.println("*******************************************************");
	}

	// ������
	public void test() {
		TestDemo td = new TestDemo();
		Scanner sc = new Scanner(System.in);
		int input = 0, input1 = 0, input2 = 0;
		//����һ�������б���������������
		PlayListCollection plc=new PlayListCollection();
		//�����������б�
		PlayList mainPlayList=new PlayList("�������б�");
		//���������б���ӵ�������
		plc.addPlayList(mainPlayList);
		PlayList favouritePlayList=null;
		while (true) {
			td.mainMenu();
			System.out.println("�������Ӧ���ֽ��в�����");
			input = sc.nextInt();
			if (input == 0) {
				break;
			}
			switch (input) {
			case 1:
				// �����б����
				while (true) {
					td.playListMenu();
					System.out.println("�������Ӧ�����ֶԲ����б���й���");
					input1 = sc.nextInt();
					if (input1 == 9)
						break;
					switch (input1) {
					case 1:
						System.out.println("��������ӵ��������б�");
						System.out.println("������Ҫ��ӵĸ�����������");
						int count=sc.nextInt();
						for(int i=1;i<=count;i++){
							System.out.println("�������"+i+"�׸�����");
							System.out.println("�����������id:");
							String strId=sc.next();
							System.out.println("���������������:");
							String strName=sc.next();
							System.out.println("�������ݳ���:");
							String strSinger=sc.next();
							//����������Ķ���
							Song song=new Song(strId,strName,strSinger);
							mainPlayList.addToPlayList(song);
							//mainPlayList.displayAllSong();
						}
						break;
					case 2:
						System.out.println("��������ӵ���ͨ�����б�");
						System.out.println("������Ҫ��ӵĲ����б����ƣ�");
						String sName=sc.next();
						//���������жϲ����б��Ƿ��ڲ������д���
						favouritePlayList=plc.searchPlayListByName(sName);
						if(favouritePlayList==null){
							System.out.println("�ò����б����ڣ����Ƚ������б���ӵ��������У�");
						}else{
							System.out.println("������Ҫ��ӵĸ�����������");
							int count1=sc.nextInt();
							for(int i=1;i<=count1;i++){
								System.out.println("�������"+i+"�׸�����");
								System.out.println("���������id��");
								String strId=sc.next();
								//�����жϸ�id�ĸ����Ƿ����������б����
								Song song=mainPlayList.searchSongById(strId);
								if(song==null){
									//������������ڣ��򴴽��µ���ӣ�������ӵ��������б�
									System.out.println("�ø������������б����ڣ��������������������Ϣ��");
									System.out.println("������������ƣ�");
									String strName=sc.next();
									System.out.println("�������ݳ��ߣ�");
									String strSinger=sc.next();
									//����һ��Song��Ķ���
									song=new Song(strId,strName,strSinger);
									//�ֱ𽫸�����ӵ���ͨ�����б���������б�
									favouritePlayList.addToPlayList(song);
									mainPlayList.addToPlayList(song);
								}else{
									//��������������������б���ֱ����ӵ����ڵĲ����б�
									favouritePlayList.addToPlayList(song);
								}
							}
							//��ʾ�����б��еĸ�����Ϣ
							System.out.println("�������б�:");
							mainPlayList.displayAllSong();
							System.out.println("��ͨ�����б�");
							favouritePlayList.displayAllSong();
						}
						break;
					case 3:
						System.out.println("ͨ������id��ѯ�����б��еĸ���");
						System.out.println("������Ҫ��ѯ�Ĳ����б����ƣ�");
						String strPlayListName1=sc.next();
						//��ѯ�����б��Ƿ����
						PlayList pl=plc.searchPlayListByName(strPlayListName1);
						if(pl==null){
							System.out.println("�ò����б����ڣ�");break;
						}else{
							System.out.println("������Ҫ��ѯ�ĸ���id��");
							String strId1=sc.next();
							Song s=pl.searchSongById(strId1);
							if(s==null){
								System.out.println("�ø����ڲ����б�"+strPlayListName1+"�в����ڣ�");
							}else{
								System.out.println("�ø�������ϢΪ��");
								System.out.println(s);
							}
						}
						break;
					case 4:
						System.out.println("ͨ���������Ʋ�ѯ�����б��еĸ���");
						break;
					case 5:
						System.out.println("�޸Ĳ����б��еĸ���");
						break;
					case 6:
						System.out.println("ɾ�������б��еĸ���");
						break;
					case 7:
						System.out.println("��ʾ�����б��е����и���");
						break;
					default:
						System.out.println("�ø���û�ж�Ӧ�Ĳ�����");
						break;

					}
				}
				break;
			case 2:
				// ����������
				while (true) {
					td.playerMenu();
					System.out.println("�������Ӧ�����ֶԲ��������й���");
					input2 = sc.nextInt();
					if (input2 == 9)
						break;
					switch (input2) {
					case 1:
						System.out.println("�򲥷�����Ӳ����б�");
						System.out.println("����Ҫ��ӵĲ����б����ƣ�");
						String playerName=sc.next();
						//����һ���µĲ����б����
						favouritePlayList=new PlayList(playerName);
						//�������б���ӵ�������Map
						plc.addPlayList(favouritePlayList);
						break;
					case 2:
						System.out.println("�Ӳ�����ɾ�������б�");
						System.out.println("������Ҫɾ���Ĳ����б����ƣ�");
						String strPlayListName=sc.next();
						if(strPlayListName.equals("�������б�")){
							System.out.println("�������б���ɾ����");
							break;
						}
						//��ѯ�����б��Ƿ����
						PlayList playList1=plc.searchPlayListByName(strPlayListName);
						if(playList1==null){
							System.out.println("�ò����б����ڣ�");
						}else{
							//������ɾ��
							plc.deletePlayList(playList1);
						}
						break;
					case 3:
						System.out.println("ͨ�����ֲ�ѯ�����б���Ϣ");
						System.out.println("������Ҫ��ѯ�Ĳ����б����ƣ�");
						String strPlayList1=sc.next();
						PlayList playList2=plc.searchPlayListByName(strPlayList1);
						if(playList2==null){
							System.out.println("�ò����б����ڣ�");
						}else{
							//��ʾ�ò����б����Ƽ����е����и���
							System.out.println("�ò����б���ڣ�");
							System.out.println("�ò����б������Ϊ��"+strPlayList1);
							playList2.displayAllSong();
						}
						break;
					case 4:
						System.out.println("��ʾ���в����б�����");
						plc.displayListName();
						break;
					default:
						System.out.println("�ø���û�ж�Ӧ�Ĳ�����");
						break;

					}
				}
				break;
			default:
				System.out.println("�ø���û�ж�Ӧ�Ĳ�����");
				break;
			}
		}
	}

	public static void main(String[] args) {
		TestDemo td = new TestDemo();
		// td.testSong();
		// td.testPlayList();
		// td.testPlayListCollection();
		td.test();

	}

}
