package file;

public class Utente {
	private static SocialNetwork Instagram;
	private String nickname;		//login
	private String email;			//registrazione
	private String password;		//registrazione-login
	private Richieste richieste;
	private int idutente;
	private static int numeroutenti;
	private int numeroamici;
	private Utente amici[];
	public Utente(String email,String password,String nickname) {
		setEmail(email);
		setPassword(password);
		setNickname(nickname);
		idutente=numeroutenti;	
		numeroutenti++;
		numeroamici=0;
		amici=new Utente[100];
		}
	public void setSocialNetwork(SocialNetwork a) {
		Instagram=a;
	}
	public void mandaRichiesta(Utente a) {
		a.richieste.addRichiesta(this.idutente);
	}
	public void visualizzaRichieste() {
		
	}
	public void accettaRichiesta(Utente a) {
		addAmico(a.getIdutente());
		a.addAmico(idutente);
	}
	public void addAmico(int id) {
		amici[numeroamici]=Instagram.cercaPerId(id);
		numeroamici++;
	}
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
}	
