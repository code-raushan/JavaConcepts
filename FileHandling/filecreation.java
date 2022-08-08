package FileHandling;
import java.io.File;
import java.io.IOException;
public class filecreation {

	public static void main(String[] args) throws IOException {
		File f2 = new File("c:/Java Programs/created.txt");
		f2.createNewFile();
		File f3 = new File("c:/Java Programs/again.txt");
		f3.createNewFile();
		System.out.println("does the file exist? "+f2.exists());
		System.out.println("does the file 'again.txt' exist? "+f3.exists());
		System.out.println("can read file f2? "+f2.canRead());
		System.out.println("can read file f3? "+f3.canRead());
		System.out.println("can write file f2? "+f2.canWrite());
		System.out.println("can write file f3? "+f3.canWrite());
		System.out.println("file length of f2 is "+f2.length());
		System.out.println("file length of f3 is "+f3.length());

	}

}
