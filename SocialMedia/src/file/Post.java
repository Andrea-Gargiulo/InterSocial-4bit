package file;

public class Post {
	private int idpost;
	private static int numeropost;
	private String nickname;
	private String testo[];
	private Commento commenti[];
	private int numerorighe;
	public Post(String nickname) {	
		numerorighe=0;
		setNickname(nickname);
		testo=new String[10];
		commenti=new Commento[10];
		idpost=numeropost;
		numeropost++;
	}
	public void stampa() {
		System.out.println(nickname);
		for(int i=0; i<numerorighe; i++) {
			System.out.println(testo[i]);
		}
	}
	public void addCommento() {
		//da fare
	}
	public void addRiga(String linea) {
		testo[numerorighe]=linea;
		numerorighe++;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}
