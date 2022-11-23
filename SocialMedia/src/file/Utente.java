package file;

public class Utente {
	private String nickname;		//login
	private String email;			//registrazione
	private String password;		//registrazione-login
	private Richieste richieste;
	private int idutente;
	private static int numeroutenti;
	private int numeroamici;
	private Utente amici[];
	private Post listapost[];
	private int numeropost;
	public Utente(String email,String password,String nickname) {
		setEmail(email);
		setPassword(password);
		setNickname(nickname);
		idutente=numeroutenti;	
		numeroutenti++;
		numeroamici=0;
		amici=new Utente[100];
		listapost=new Post[100];
		numeropost++;
		}
	public void mandaRichiesta(Utente a) {
		a.richieste.addRichiesta(this.idutente);
	}
	public void visualizzaRichieste() {
		
	}
	/*public void accettaRichiesta(Utente a) {
		addAmico(a.getIdutente());
		a.addAmico(idutente);
	}*/
	/*public void addAmico(int id) {
		amici[numeroamici]=cercaPerId(id);
		numeroamici++;
	}*/
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIdutente() {
		return idutente;
	}
	public void setIdutente(int idutente) {
		this.idutente = idutente;
	}
	public void addPost(Post a) {
		listapost[numeropost]=a;
		numeropost++;
	}
	public void stampaPost() {
		for(int i=0; i<numeropost; i++) {
			listapost[i].stampa();
		}
	}
	
}	
