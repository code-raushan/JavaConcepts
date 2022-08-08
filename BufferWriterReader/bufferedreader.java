package BufferWriterReader;
import java.io.*; //java.io.BufferedReader

public class bufferedreader {

	public static void main(String[] args) throws IOException {
		int ch;
		BufferedReader br = new BufferedReader(new FileReader("c:/Java Programs/created.txt"));
		//FileReader is a child class of Reader class.
		while((ch=br.read())!=-1) {
			System.out.print((char)ch);
		}
		br.close();

	}

}
