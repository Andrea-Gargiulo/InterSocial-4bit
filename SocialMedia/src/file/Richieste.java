package file;

public class Richieste {
	private int idutente;
	private int richieste[];
	private int numerorichieste;
	public Richieste(int idutente) {
		numerorichieste=0;
		setIdutente(idutente);
		richieste=new int[10];
	}
	public void addRichiesta(int a) {
		richieste[numerorichieste]=a;//aggiunge l'id di chi ha mandato la richiesta di amicizia
	}
	public int getIdutente() {
		return idutente;
	}

	public void setIdutente(int idutente) {
		this.idutente = idutente;
	}
}
