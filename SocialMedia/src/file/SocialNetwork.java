package file;

import java.io.IOException;

public class SocialNetwork {
	private static Utente listautenti[];
	private Post listapost[];
	private Commento listacommenti[];
	private Richieste listarichieste[];
	Utente loggato;
	int numerorichieste=0;
	int numerocommenti=0;
	int numeropost=0;
	private static int numeroutenti=0;
	
	public SocialNetwork() {
		listautenti=new Utente[100];
		listapost=new Post[100];
		listacommenti=new Commento[100];
		listarichieste=new Richieste[100];
		}
	public static Utente cercaPerId(int idutente) {
		for(int i=0; i<numeroutenti; i++) {	
			if(listautenti[i].getIdutente()==idutente) {
				return listautenti[i];
			}	
		}
		return null;
	}
	public static Utente cercaPerNome(String nomeutente) {
		for(int i=0; i<numeroutenti; i++) {	
			if(listautenti[i].getNickname().equals(nomeutente)) {
				return listautenti[i];
			}	
		}
		return null;
	}
	//cercapernome
	public void caricaTutto() throws IOException, FileException {
		caricaUtenti();
	}
	public void caricaUtenti() throws IOException, FileException {
		String riga;
		
		TextFile in=new TextFile("Utenti.txt", 'R');
		
		try {
			while(true) {
				riga=in.fromFile();
				String[] risultato=new String[3];
				risultato=riga.split(",");
				
				Utente a=new Utente(risultato[0],risultato[1],risultato[2]);
				creaUtente(a);
			}
		}catch(FileException exception){
			
			System.out.println(exception.getMatter());//stampa end of file
		}
	}
	public void creaUtente(Utente a) {
		listautenti[numeroutenti]=a;
		numeroutenti++;
	}
	public void stampaPerNome(String nick) {
		cercaPerNome(nick).stampaPost();
	}
	public void caricaPost() throws IOException, FileException {
		String riga;
		
		TextFile in=new TextFile("Post.txt", 'R');
		try{
			riga=in.fromFile();
			String risultato[]=riga.split(",");
			String nick=risultato[0];
			System.out.println(risultato[1]);
			int n=Integer.parseInt(risultato[1]);
			
			Post a=new Post(nick);
			for(int i=0; i<n; i++) {
				a.addRiga(in.fromFile());
			}
			cercaPerNome(nick).addPost(a);		
			}catch(FileException exception) {
				System.out.println(exception.getMatter());
			}
		
		
		
	}
	/*public utente login(String nickname,String password) {
		//se non trova utente dice utente non esistente
		//se trova utente ma password errata lo dice
		//se tutti e due sono corretti Utente loggato=utente passato
		//restituisce l'utente loggato
	}*/
	public void registra(String email,String password) {
		//controlla la mail (mail è gia stata presa)
		System.out.println("inserisci nickname");
		//controlla se il nickname è gia preso(il nickname è gia stato preso)
	}
	public void stampaUtenti() {
		for(int i=0; i<numeroutenti; i++) {
			System.out.println(listautenti[i].getEmail());
			System.out.println(listautenti[i].getNickname());
			System.out.println(listautenti[i].getPassword());
		}
	}
}
