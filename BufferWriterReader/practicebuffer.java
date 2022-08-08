package BufferWriterReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter; 
import java.io.BufferedReader;
import java.io.IOException;
public class practicebuffer {

	public static void main(String[] args) throws IOException {
		//file creation
		File fnew = new File("c:/Java Programs/sumit.txt");
		fnew.createNewFile();
		//BufferedWriter Operation
		BufferedWriter bw = new BufferedWriter(new FileWriter(fnew, true));
		bw.write("My real name is Sumit Raj"); //writing operation
		bw.close(); //closing the writing operation
		//BufferedReader Operation
		int ch;
		BufferedReader br = new BufferedReader(new FileReader(fnew));
		while((ch=br.read())!=-1) {
			System.out.print((char)ch);
		}
		br.close();
	}

}
