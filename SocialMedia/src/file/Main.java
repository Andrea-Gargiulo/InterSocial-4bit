package file;
import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		String riga;
		
		TextFile in=new TextFile("test.txt", 'R');
		try {
			while(true) {
				riga=in.fromFile();
				String[] risultato=riga.split(",");
				Utente a=new Utente(risultato[0],risultato[1],risultato[2]);
				System.out.println(a.getEmail()+a.getPassword()+a.getNickname());
			}
		}catch(FileException exception){
			
			System.out.println(exception.getMatter());//stampa end of file
		}
		
			
	}

}
