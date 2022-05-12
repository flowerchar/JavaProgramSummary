package Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayList {
	private String playListName;//�����б������
	private List<Song> musicList;//�����б�ĸ�������
	/**
	 * ���췽��
	 * @param playListName �����б������
	 */
	public PlayList(String playListName){
		this.playListName=playListName;
		musicList=new ArrayList<Song>();
	}
	/**
	 * ��������ӵ������б�
	 * @param song Ҫ��ӵĸ���
	 */
	public void addToPlayList(Song song){
		//Ҫ�ų��ظ���ӵ����
		boolean flag=false;//�жϲ����б��еĸ����Ƿ����
		for(Song song1:musicList){
			if(song1.equals(song)){
				flag=true;break;
			}
		}
		if(flag){
			System.out.println("�ø����Ѿ������ڲ����б��У����ʧ�ܣ�");
		}else{
			musicList.add(song);
		}
	}
	/**
	 * ͨ������id��ѯ
	 * @param id ����id
	 * @return ��ѯ���ĸ�����Ϣ
	 */
	public Song searchSongById(String id){
		Song song=null;
		//Id��Ψһ��
		for(Song song1:musicList){
			if(song1.getId().equals(id)){
				//�����Ⱦ��ҵ���
				song=song1;break;
			}
		}
		return song;
	}
	/**
	 * ���ݸ��������Ʋ�ѯ
	 * @param name ��������
	 * @return ��ѯ���ĸ�����Ϣ
	 */
	public Song searchSongByName(String name){
		Song song=null;
		for(Song song1:musicList){
			if(song1.getName().equals(name)){
				//�����Ⱦ��ҵ���
				song=song1;break;
			}
		}
		return song;

	}

	/**
	 * �޸Ĳ����б��еĸ�����Ϣ
	 * @param id Ҫ�޸ĵĸ���id
	 * @param song �µĸ�����Ϣ
	 */
	public void updateSong(String id,Song song){
		//����id��ѯ����صĸ�����Ϣ��Ȼ���ٽ����޸�
		Song song1=searchSongById(id);
		if(song1==null){
			System.out.println("û���ҵ�idΪ"+id+"��Ӧ�ĸ�����Ϣ��");
		}else{
			//���Ƴ�ԭ������Ϣ��Ȼ�����������
			musicList.remove(song1);
			musicList.add(song);
			System.out.println("�޸ĳɹ���");
		}
	}
	/**
	 * ɾ�������б��е�ָ��������Ϣ
	 * @param id ����id
	 */
	public void deleteSong(String id){
		Song song=searchSongById(id);
		if(song!=null){
			musicList.remove(song);
		}else{
			System.out.println("û���ҵ�idΪ"+id+"��Ӧ�ĸ�����Ϣ��");
		}
	}
	/**
	 * ��ʾ�����б��е����и���
	 */
	public void displayAllSong(){
		System.out.println("�����б��е����и���Ϊ��");
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
