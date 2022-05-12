- 项目需求

  - 播放列表管理
    - 将歌曲添加到主播放列表
    - 将歌曲添加到普通播放列表
    - 通过id查询播放列表中的歌曲
    - 通过歌曲名查询播放列表中的歌曲
    - 修改播放列表中的歌曲
    - 删除播放列表中的歌曲
    - 显示播放列表的所有歌曲
  - 播放器管理
    - 向播放器添加播放列表
    - 从播放器删除播放列表
    - 通过名字查询播放列表信息
    - 显示所有播放列表名称
- 项目设计

  - 类

    - 歌曲类：Song
      - 属性
        - id
        - name
        - singer
      - 方法
        - 构造器
        - getter setter
        - hashCode equals
        - toString
    - 播放列表类：PlayList
      - 属性
        - playListName（String）
        - musicList（List）
      - 方法
        - 构造器
        - getter setter
        - 将歌曲添加到播放列表 void addToPlayList(Song song)
        - 显示播放列表中的所有歌曲 void displayAllSong()
        - 通过id查询歌曲 Song searchSongById(String id)
        - 通过名称查询歌曲 Song searchSongByName(String n)
        - 修改歌曲 void updateSong(String id, Song song)
        - 从播放器删除歌曲 void deleteSong(String id)
        - 按歌名进行排序 void sortBySongName()
    - 播放器类：PlayListCollection
      - 属性
        - 存播放列表的集合 playListMap（Map）
      - 方法
        - 构造器
        - getter setter
        - 添加播放列表 void addPlayList(PlayList playList)
        - 删除播放列表 void deletePlayList(PlayList playList)
        - 通过名字查询 PlayList searchPlayListByName(String playListName)
        - 显示所有播放列表名称 void displayPlayListName()
    - 测试类：TestDemo




- 源代码

- Song

  ```java
  /**
   * 歌曲类
   * @author flowerchar
   *
   */
  public class Song {
  	private String id;//id
  	private String name;//歌曲名称
  	private String singer;//演唱者
  	public Song(String id,String name,String singer){
  		this.id=id;
  		this.name=name;
  		this.singer=singer;
  	}
  	public String getId() {
  		return id;
  	}
  	public void setId(String id) {
  		this.id = id;
  	}
  	public String getName() {
  		return name;
  	}
  	public void setName(String name) {
  		this.name = name;
  	}
  	public String getSinger() {
  		return singer;
  	}
  	public void setSinger(String singer) {
  		this.singer = singer;
  	}
  	@Override
  	public int hashCode() {
  		final int prime = 31;
  		int result = 1;
  		result = prime * result + ((id == null) ? 0 : id.hashCode());
  		result = prime * result + ((name == null) ? 0 : name.hashCode());
  		result = prime * result + ((singer == null) ? 0 : singer.hashCode());
  		return result;
  	}
  	@Override
  	public boolean equals(Object obj) {
  		//判断对象是否相等，相等则直接返回true
  		if(this==obj)
  			return true;
  		//this!=obj
  		if(obj.getClass()==Song.class){
  			Song song=(Song)obj;
  			return (song.getId().equals(id))&&(song.getName().equals(name))
  					&&(song.getSinger().equals(singer));
  		}
  		return false;
  	}
  	@Override
  	public String toString() {
  		return "歌曲信息 ：id为" + id + ", 歌曲名称为：" + name + ", 演唱者为：" + singer ;
  	}
  	
  	
  }
  
  ```

- PlayList

  ```java
  import java.util.ArrayList;
  import java.util.Collections;
  import java.util.List;
  
  public class PlayList {
  	private String playListName;//播放列表的名称
  	private List<Song> musicList;//播放列表的歌曲集合
  	/**
  	 * 构造方法
  	 * @param playListName 播放列表的名称
  	 */
  	public PlayList(String playListName){
  		this.playListName=playListName;
  		musicList=new ArrayList<Song>();
  	}
  	/**
  	 * 将歌曲添加到播放列表
  	 * @param song 要添加的歌曲
  	 */
  	public void addToPlayList(Song song){
  		//要排除重复添加的情况
  		boolean flag=false;//判断播放列表中的歌曲是否存在
  		for(Song song1:musicList){
  			if(song1.equals(song)){
  				flag=true;break;
  			}
  		}
  		if(flag){
  			System.out.println("该歌曲已经存在于播放列表中，添加失败！");
  		}else{
  			musicList.add(song);
  		}
  	}
  	/**
  	 * 通过歌曲id查询
  	 * @param id 歌曲id
  	 * @return 查询到的歌曲信息
  	 */
  	public Song searchSongById(String id){
  		Song song=null;
  		//Id是唯一的
  		for(Song song1:musicList){
  			if(song1.getId().equals(id)){
  				//如果相等就找到了
  				song=song1;break;
  			}
  		}
  		return song;
  	}
  	/**
  	 * 根据歌曲的名称查询
  	 * @param name 歌曲名称
  	 * @return 查询到的歌曲信息
  	 */
  	public Song searchSongByName(String name){
  		Song song=null;
  		for(Song song1:musicList){
  			if(song1.getName().equals(name)){
  				//如果相等就找到了
  				song=song1;break;
  			}
  		}
  		return song;
  
  	}
  
  	/**
  	 * 修改播放列表中的歌曲信息
  	 * @param id 要修改的歌曲id
  	 * @param song 新的歌曲信息
  	 */
  	public void updateSong(String id,Song song){
  		//根据id查询到相关的歌曲信息，然后再进行修改
  		Song song1=searchSongById(id);
  		if(song1==null){
  			System.out.println("没有找到id为"+id+"对应的歌曲信息！");
  		}else{
  			//先移除原来的信息，然后再重新添加
  			musicList.remove(song1);
  			musicList.add(song);
  			System.out.println("修改成功！");
  		}
  	}
  	/**
  	 * 删除播放列表中的指定歌曲信息
  	 * @param id 歌曲id
  	 */
  	public void deleteSong(String id){
  		Song song=searchSongById(id);
  		if(song!=null){
  			musicList.remove(song);
  		}else{
  			System.out.println("没有找到id为"+id+"对应的歌曲信息！");
  		}
  	}
  	/**
  	 * 显示播放列表中的所有歌曲
  	 */
  	public void displayAllSong(){
  		System.out.println("播放列表中的所有歌曲为：");
  		for(Song song:musicList){
  			System.out.println(song);
  		}
  	}
  	public String getPlayListName() {
  		return playListName;
  	}
  	public void setPlayListName(String playListName) {
  		this.playListName = playListName;
  	}
  	public List<Song> getMusicList() {
  		return musicList;
  	}
  	public void setMusicList(List<Song> musicList) {
  		this.musicList = musicList;
  	}
  	
  }
  
  ```

- PlayListCollection

  ```java
  import java.util.HashMap;
  import java.util.Map;
  import java.util.Set;
  
  /**
   * 播放列表集合
   * @author flowerchar
   *
   */
  public class PlayListCollection {
  	Map<String,PlayList> playListMap;//存放播放列表集合
  	public PlayListCollection(){
  		playListMap=new HashMap<String,PlayList>();
  	}
  	/**
  	 * 向播放列表集合（播放器）添加播放列表
  	 * @param playList 要添加的播放列表
  	 */
  	public void addPlayList(PlayList playList){
  		//播放列表名称作为key值
  		playListMap.put(playList.getPlayListName(),playList);
  	}
  	/**
  	 * 删除播放列表	
  	 * @param playList 要删除的播放列表对象
  	 */
  	public void deletePlayList(PlayList playList){
  		playListMap.remove(playList.getPlayListName());
  		System.out.println("删除成功！");
  	}
  	/**
  	 * 通过播放列表的名称查询播放列表
  	 * @param playListName 播放列表名称
  	 * @return 播放列表
  	 */
  	public PlayList searchPlayListByName(String playListName){
  		PlayList playList=null;
  		Set<String> playListSet=playListMap.keySet();
  		for(String s:playListSet){
  			if(s.equals(playListName)){
  				playList=playListMap.get(s);break;
  			}
  		}
  		return playList;
  	}
  	/**
  	 * 显示所有播放列表的名称
  	 */
  	public void displayListName(){
  		Set<String> playListSet=playListMap.keySet();
  		System.out.println("播放列表名称为：");
  		for(String s:playListSet){
  			System.out.println(s);
  		}
  	}
  	public Map<String, PlayList> getPlayListMap() {
  		return playListMap;
  	}
  	public void setPlayListMap(Map<String, PlayList> playListMap) {
  		this.playListMap = playListMap;
  	}
  	
  }
  
  ```

- TestDemo

  ```java
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
  
  ```

  