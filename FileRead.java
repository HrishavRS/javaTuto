import java.io.File;

public class FileRead{
	public static void main(String[] args){
		File myFile= new File("test.txt");
		if(myFile.exists()){
			System.out.println("File Name: "+myFile.getName());
			System.out.println("Absolute Path: "+myFile.getAbsolutePath());
			System.out.println("Writeable: "+myFile.canWrite());
			System.out.println("Readable: "+myFile.canRead());
			System.out.println("File Size in Bytes: "+myFile.length());
		}else{
			System.out.println("File Doesn't Exists");
		}
	} 
}