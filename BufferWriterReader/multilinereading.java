package BufferWriterReader;
import java.io.*;

public class multilinereading {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new FileReader("c:/Java Programs/created.txt"));
		String s1;
		//readLine() reads single line
		while((s1=br1.readLine())!= null) {
			System.out.println(s1);
		}
		br1.close();
	}

}
