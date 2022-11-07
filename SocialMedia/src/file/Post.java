package file;

public class Post {
	private int idpost;
	private static int numeropost;
	private int idutente;
	private String testo[];
	private Commento commenti[];
	private int numerorighe;
	public Post(int idutente) {	
		numerorighe=0;
		testo=new String[10];
		commenti=new Commento[10];
		idpost=numeropost;
		numeropost++;
	}
	public void addCommento() {
		//da fare
	}
	public void addRiga(String linea) {
		testo[numerorighe]=linea;
		numerorighe++;
	}
	public int getIdutente() {
		return idutente;
	}
	public void setIdutente(int idutente) {
		this.idutente = idutente;
	}
}
