package file;

public class Commento {
	private String idutente;
	private int idcommento;
	private String testo[];
	private int numerorighe;
	public Commento(String idutente,int idcommento) {
		numerorighe=0;
		setIdutente(idutente);
		setIdcommento(idcommento);
		testo=new String[10];
	}
	public void addRiga(String linea) {
		testo[numerorighe]=linea;
		numerorighe++;
	}
	public String getIdutente() {
		return idutente;
	}

	public void setIdutente(String idutente) {
		this.idutente = idutente;
	}

	public int getIdcommento() {
		return idcommento;
	}

	public void setIdcommento(int idcommento) {
		this.idcommento = idcommento;
	}

	
}
