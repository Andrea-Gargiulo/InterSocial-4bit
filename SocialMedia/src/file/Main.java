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
				System.out.println(riga);
			}
		}catch(FileException exception){
			
			System.out.println(exception.getMatter());//stampa end of file
		}
		
			
	}

}
