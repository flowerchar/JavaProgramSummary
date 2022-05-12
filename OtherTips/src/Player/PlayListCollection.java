package Player;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * �����б���
 * @author flowerchar
 *
 */
public class PlayListCollection {
	Map<String,PlayList> playListMap;//��Ų����б���
	public PlayListCollection(){
		playListMap=new HashMap<String,PlayList>();
	}
	/**
	 * �򲥷��б��ϣ�����������Ӳ����б�
	 * @param playList Ҫ��ӵĲ����б�
	 */
	public void addPlayList(PlayList playList){
		//�����б�������Ϊkeyֵ
		playListMap.put(playList.getPlayListName(),playList);
	}
	/**
	 * ɾ�������б�	
	 * @param playList Ҫɾ���Ĳ����б����
	 */
	public void deletePlayList(PlayList playList){
		playListMap.remove(playList.getPlayListName());
		System.out.println("ɾ���ɹ���");
	}
	/**
	 * ͨ�������б�����Ʋ�ѯ�����б�
	 * @param playListName �����б�����
	 * @return �����б�
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
	 * ��ʾ���в����б������
	 */
	public void displayListName(){
		Set<String> playListSet=playListMap.keySet();
		System.out.println("�����б�����Ϊ��");
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
