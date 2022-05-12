package Player;

import java.util.Scanner;

public class TestDemo {

	// 对歌曲类Song进行测试
	public void testSong() {
		Song song1 = new Song("s001", "孤独患者", "陈奕迅");
		Song song2 = new Song("s002", "野孩子", "杨千嬅");
		Song song3 = new Song("s003", "侯斯顿之恋", "张国荣");
		Song song4 = new Song("s003", "侯斯顿之恋", "张国荣");
		System.out.println(song1);
		// 测试song1和song3这两个对象是否相等r
		System.out.println("song1==song3?" + (song1.equals(song3)));
		System.out.println("song4==song3?" + (song4.equals(song3)));
		System.out.println(song3 == song4);

	}

	// 对播放列表类PlayList进行测试
	public void testPlayList() {
		// 定义几个Song类的对象，添加到播放列表中
		Song song1 = new Song("s001", "孤独患者", "陈奕迅");
		Song song2 = new Song("s002", "野孩子", "杨千嬅");
		Song song3 = new Song("s003", "侯斯顿之恋", "张国荣");
		Song song4 = new Song("s003", "侯斯顿之恋", "张国荣");
		// 创建一个PlayList对象
		PlayList mainPlayList = new PlayList("主播放列表");
		mainPlayList.addToPlayList(song1);
		mainPlayList.addToPlayList(song2);
		mainPlayList.addToPlayList(song3);
		mainPlayList.addToPlayList(song4);
		// 显示播放列表的内容
		mainPlayList.displayAllSong();
		// 通过id查询歌曲信息
		Song song = mainPlayList.searchSongById("s005");
		if (song != null) {
			System.out.println("根据id查询的歌曲信息为：");
			System.out.println(song);
		} else {
			System.out.println("该歌曲不存在！");
		}
		// 通过名称查询歌曲信息
		song = null;
		song = mainPlayList.searchSongByName("野孩子");
		if (song != null) {
			System.out.println("根据name查询的歌曲信息为：");
			System.out.println(song);
		} else {
			System.out.println("该歌曲不存在！");
		}
		// 修改歌曲信息
		Song songUpdate = new Song("s005", "侯斯顿之恋", "陈奕迅");
		mainPlayList.updateSong("s003", songUpdate);
		mainPlayList.displayAllSong();
		// 删除歌曲信息
		mainPlayList.deleteSong("s005");
		mainPlayList.displayAllSong();

	}

	// 测试播放列表集合类
	public void testPlayListCollection() {
		Song song1 = new Song("s001", "孤独患者", "陈奕迅");
		Song song2 = new Song("s002", "野孩子", "杨千嬅");
		Song song3 = new Song("s003", "侯斯顿之恋", "张国荣");
		// 创建主播放列表
		PlayList mainPlayList = new PlayList("主播放列表");
		// 将歌曲添加到主播放列表中
		mainPlayList.addToPlayList(song1);
		mainPlayList.addToPlayList(song2);
		mainPlayList.addToPlayList(song3);
		// 定义一个新的播放列表，从主播放列表中添加歌曲进来
		PlayList favouritePalyList = new PlayList("最喜欢的歌曲");
		favouritePalyList.addToPlayList(mainPlayList.getMusicList().get(0));
		favouritePalyList.addToPlayList(mainPlayList.getMusicList().get(1));
		favouritePalyList.displayAllSong();
		// 将两个播放列表添加到播放列表集合中
		PlayListCollection plc = new PlayListCollection();
		plc.addPlayList(mainPlayList);
		plc.addPlayList(favouritePalyList);
		plc.displayListName();
		// 根据播放列表名字查询播放列表信息，并显示所有歌曲
		PlayList playList = plc.searchPlayListByName("最喜欢的歌曲");
		playList.displayAllSong();
		// 删除播放列表信息
		System.out.println("删除前：");
		plc.displayListName();
		plc.deletePlayList(favouritePalyList);
		System.out.println("删除后：");
		plc.displayListName();
	}

	// 主菜单
	public void mainMenu() {
		System.out.println("***************************************");
		System.out.println("                 **主菜单**                      ");
		System.out.println("                 1--播放列表管理    ");
		System.out.println("                 2--播放器管理    ");
		System.out.println("                 0--退出   ");
		System.out.println("***************************************");

	}

	// 播放列表管理菜单
	public void playListMenu() {
		System.out.println("*******************************************************");
		System.out.println("                 **播放列表管理**    ");
		System.out.println("                 1--将歌曲添加到主播放列表    ");
		System.out.println("                 2--将歌曲添加到普通播放列表    ");
		System.out.println("                 3--通过歌曲id查询播放列表中的歌曲    ");
		System.out.println("                 4--通过歌曲名称查询播放列表中的歌曲    ");
		System.out.println("                 5--修改播放列表中的歌曲    ");
		System.out.println("                 6--删除播放列表中的歌曲    ");
		System.out.println("                 7--显示播放列表中的所有歌曲    ");
		System.out.println("                 9--返回上一级菜单   ");
		System.out.println("*******************************************************");
	}

	// 播放器菜单
	public void playerMenu() {
		System.out.println("*******************************************************");
		System.out.println("                 **播放器管理**    ");
		System.out.println("                 1--向播放器添加播放列表    ");
		System.out.println("                 2--从播放器删除播放列表    ");
		System.out.println("                 3--通过名字查询播放列表信息    ");
		System.out.println("                 4--显示所有播放列表名称    ");
		System.out.println("                 9--返回上一级菜单   ");
		System.out.println("*******************************************************");
	}

	// 主流程
	public void test() {
		TestDemo td = new TestDemo();
		Scanner sc = new Scanner(System.in);
		int input = 0, input1 = 0, input2 = 0;
		//创建一个播放列表容器（播放器）
		PlayListCollection plc=new PlayListCollection();
		//创建主播放列表
		PlayList mainPlayList=new PlayList("主播放列表");
		//将主播放列表添加到播放器
		plc.addPlayList(mainPlayList);
		PlayList favouritePlayList=null;
		while (true) {
			td.mainMenu();
			System.out.println("请输入对应数字进行操作：");
			input = sc.nextInt();
			if (input == 0) {
				break;
			}
			switch (input) {
			case 1:
				// 播放列表管理
				while (true) {
					td.playListMenu();
					System.out.println("请输入对应的数字对播放列表进行管理：");
					input1 = sc.nextInt();
					if (input1 == 9)
						break;
					switch (input1) {
					case 1:
						System.out.println("将歌曲添加到主播放列表");
						System.out.println("请输入要添加的歌曲的数量：");
						int count=sc.nextInt();
						for(int i=1;i<=count;i++){
							System.out.println("请输入第"+i+"首歌曲：");
							System.out.println("请输入歌曲的id:");
							String strId=sc.next();
							System.out.println("请输入歌曲的名称:");
							String strName=sc.next();
							System.out.println("请输入演唱者:");
							String strSinger=sc.next();
							//创建歌曲类的对象
							Song song=new Song(strId,strName,strSinger);
							mainPlayList.addToPlayList(song);
							//mainPlayList.displayAllSong();
						}
						break;
					case 2:
						System.out.println("将歌曲添加到普通播放列表");
						System.out.println("请输入要添加的播放列表名称：");
						String sName=sc.next();
						//根据名称判断播放列表是否在播放器中存在
						favouritePlayList=plc.searchPlayListByName(sName);
						if(favouritePlayList==null){
							System.out.println("该播放列表不存在，请先将播放列表添加到播放器中！");
						}else{
							System.out.println("请输入要添加的歌曲的数量：");
							int count1=sc.nextInt();
							for(int i=1;i<=count1;i++){
								System.out.println("请输入第"+i+"首歌曲：");
								System.out.println("请输入歌曲id：");
								String strId=sc.next();
								//首先判断该id的歌曲是否在主播放列表存在
								Song song=mainPlayList.searchSongById(strId);
								if(song==null){
									//如果歌曲不存在，则创建新的添加，并且添加到主播放列表
									System.out.println("该歌曲在主播放列表不存在，继续输入歌曲的其他信息！");
									System.out.println("请输入歌曲名称：");
									String strName=sc.next();
									System.out.println("请输入演唱者：");
									String strSinger=sc.next();
									//创建一个Song类的对象
									song=new Song(strId,strName,strSinger);
									//分别将歌曲添加到普通播放列表和主播放列表
									favouritePlayList.addToPlayList(song);
									mainPlayList.addToPlayList(song);
								}else{
									//如果歌曲存在于主播放列表，则直接添加到现在的播放列表
									favouritePlayList.addToPlayList(song);
								}
							}
							//显示播放列表中的歌曲信息
							System.out.println("主播放列表:");
							mainPlayList.displayAllSong();
							System.out.println("普通播放列表：");
							favouritePlayList.displayAllSong();
						}
						break;
					case 3:
						System.out.println("通过歌曲id查询播放列表中的歌曲");
						System.out.println("请输入要查询的播放列表名称：");
						String strPlayListName1=sc.next();
						//查询播放列表是否存在
						PlayList pl=plc.searchPlayListByName(strPlayListName1);
						if(pl==null){
							System.out.println("该播放列表不存在！");break;
						}else{
							System.out.println("请输入要查询的歌曲id：");
							String strId1=sc.next();
							Song s=pl.searchSongById(strId1);
							if(s==null){
								System.out.println("该歌曲在播放列表"+strPlayListName1+"中不存在！");
							}else{
								System.out.println("该歌曲的信息为：");
								System.out.println(s);
							}
						}
						break;
					case 4:
						System.out.println("通过歌曲名称查询播放列表中的歌曲");
						break;
					case 5:
						System.out.println("修改播放列表中的歌曲");
						break;
					case 6:
						System.out.println("删除播放列表中的歌曲");
						break;
					case 7:
						System.out.println("显示播放列表中的所有歌曲");
						break;
					default:
						System.out.println("该歌曲没有对应的操作！");
						break;

					}
				}
				break;
			case 2:
				// 播放器管理
				while (true) {
					td.playerMenu();
					System.out.println("请输入对应的数字对播放器进行管理：");
					input2 = sc.nextInt();
					if (input2 == 9)
						break;
					switch (input2) {
					case 1:
						System.out.println("向播放器添加播放列表");
						System.out.println("输入要添加的播放列表名称：");
						String playerName=sc.next();
						//创建一个新的播放列表对象
						favouritePlayList=new PlayList(playerName);
						//将播放列表添加到播放器Map
						plc.addPlayList(favouritePlayList);
						break;
					case 2:
						System.out.println("从播放器删除播放列表");
						System.out.println("请输入要删除的播放列表名称：");
						String strPlayListName=sc.next();
						if(strPlayListName.equals("主播放列表")){
							System.out.println("主播放列表不能删除！");
							break;
						}
						//查询播放列表是否存在
						PlayList playList1=plc.searchPlayListByName(strPlayListName);
						if(playList1==null){
							System.out.println("该播放列表不存在！");
						}else{
							//存在则删除
							plc.deletePlayList(playList1);
						}
						break;
					case 3:
						System.out.println("通过名字查询播放列表信息");
						System.out.println("请输入要查询的播放列表名称：");
						String strPlayList1=sc.next();
						PlayList playList2=plc.searchPlayListByName(strPlayList1);
						if(playList2==null){
							System.out.println("该播放列表不存在！");
						}else{
							//显示该播放列表名称及其中的所有歌曲
							System.out.println("该播放列表存在！");
							System.out.println("该播放列表的名称为："+strPlayList1);
							playList2.displayAllSong();
						}
						break;
					case 4:
						System.out.println("显示所有播放列表名称");
						plc.displayListName();
						break;
					default:
						System.out.println("该歌曲没有对应的操作！");
						break;

					}
				}
				break;
			default:
				System.out.println("该歌曲没有对应的操作！");
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
