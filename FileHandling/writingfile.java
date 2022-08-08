package FileHandling;
import java.io.FileOutputStream;
import java.io.IOException;
public class writingfile {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		//writing file content via java program
		//FileLOutputStream is meant for writing streams of raw bytes. It is a subclass of OutputStream 
		int i;
		//A file output stream is an output stream for writing data to a File or to a FileDescriptor.
		FileOutputStream fout;
		fout = new FileOutputStream("c:/Java Programs/again.txt", true);//providing file absolute path and setting appending boolean to be true
		String s = "Hello file 'again";
		
		char ch[]=s.toCharArray(); //creating given string into a sequence of characters.
		for(i=0; i<s.length();i++) {
			fout.write(ch[i]);//appending the characters of the string iteratively.
			
		}
		fout.close();//closing the operation and saving the changes to Permanent Storage.
		
		
	}

}
