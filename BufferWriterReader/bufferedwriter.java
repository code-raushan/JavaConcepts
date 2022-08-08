package BufferWriterReader;
import java.io.*; //BufferedWriter


public class bufferedwriter {

	public static void main(String[] args) throws IOException{
		//BufferedWriter(Writer out); //Writer is a class and appending is true.
		BufferedWriter bf = new BufferedWriter(new FileWriter("c:/Java Programs/created.txt", true));
		//FileWriter is a child class of Writer class
		bf.write("Computer"); //writing into the file
		bf.close();//closing the operation
		

	}

}
