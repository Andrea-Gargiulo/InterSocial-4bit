package file;
import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException, FileException {
		// TODO Auto-generated method stub
		
		SocialNetwork Instagram=new SocialNetwork();
		Instagram.caricaUtenti();
		Instagram.stampaUtenti();
		 Instagram.caricaPost();
		Instagram.stampaPerNome("nick1");
		
		
		
			
	}

}
