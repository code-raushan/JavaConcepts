package FileHandling;
import java.io.File;
import java.io.IOException;

public class fileaccesspractice {
	public static void main(String[] args) throws IOException{
		File f1 = new File("c:/Java Programs/raushan.txt");
		//File Object takes the pathname as a string.
		f1.createNewFile(); // creates file in the specified file path, if not created already.
		System.out.println("can access file? "+f1.canWrite()); //checks whether file can be written by the program
		System.out.println("can read file? "+f1.canRead()); //checks whether file can be read.
		System.out.println("can execute file? "+f1.canExecute()); //check whether file can be executed.
		//to delete file.use below:
		f1.delete(); //deletes the file
	}
}
