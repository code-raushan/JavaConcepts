package FileHandling;
import java.io.File;
import java.io.FileOutputStream; 
import java.io.FileInputStream;
import java.io.IOException;

public class filesoperations {

	public static void main(String[] args) throws IOException{
		//Writing Operation
		FileOutputStream fout = new FileOutputStream("c:/Java Programs/raushan.txt", true);
		String s = "My name is Raushan Kumar";
		char[] c = s.toCharArray();
		for(int i=0; i<c.length; i++) {
			fout.write(c[i]);
		}
		fout.close(); //closing the operation of writing
		//Reading Operation
		int i;
		FileInputStream fin = new FileInputStream("c:/Java Programs/raushan.txt");
		do {
			i = fin.read(); //read() returns the next byte of data, or -1 if the end of the file is reached
			if(i != -1) {
				System.out.print((char)i);
			}
		}while(i!=-1);
		fin.close();//closing the operation of reading
	}

}
