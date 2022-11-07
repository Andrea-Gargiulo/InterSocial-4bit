package file;

public class SocialNetwork {
	private Utente listautenti[];
	private Post listapost[];
	private Commento listacommenti[];
	private Richieste listarichieste[];
	int numerorichieste=0;
	int numerocommenti=0;
	int numeropost=0;
	int numeroutenti=0;
	
	public SocialNetwork() {
		listautenti=new Utente[100];
		listapost=new Post[100];
		listacommenti=new Commento[100];
		listarichieste=new Richieste[100];
		}
	public Utente cercaPerId(int idutente) {
		for(int i=0; i<numeroutenti; i++) {	
			if(listautenti[i].getIdutente()==idutente) {
				return listautenti[i];
			}	
		}
		return null;
	}
}
