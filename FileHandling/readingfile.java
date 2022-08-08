package FileHandling;
import java.io.*;

public class readingfile {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		int i;
		FileInputStream fin; 
		fin = new FileInputStream("c:/Java Programs/again.txt");//object of FileInputStream
		do {
			i=fin.read();
			if(i != -1) {
				System.out.print((char)i);
			 }
		   }while(i != -1);
			fin.close();
		
		

	}

}
