package Player;
/**
 * ������
 * @author flowerchar
 *
 */
public class Song {
	private String id;//id
	private String name;//��������
	private String singer;//�ݳ���
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
		//�ж϶����Ƿ���ȣ������ֱ�ӷ���true
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
		return "������Ϣ ��idΪ" + id + ", ��������Ϊ��" + name + ", �ݳ���Ϊ��" + singer ;
	}
	
	
}
