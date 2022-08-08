package FileHandling;
import java.io.File; 
import java.io.IOException;

public class fileaccess {

	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/Java Programs/name1.txt");//file already exists
		//in case file does not, file can be created also, using createNewFile method
		
		//to check whether the file exists or not, we use exists() method		
		System.out.println("does file exist? "+f1.exists());
		
		//to check whether file can be read, we use canWrite method
		System.out.println("can file read? "+f1.canWrite());
		//to get the name of the file, we use getName method		
		System.out.println("file name is "+f1.getName());
		//to get the file content length, we use length() method
		System.out.println("Length of file "+f1.length());
		//to delete a file, we can use delete() method
		f1.delete();
	}

}
