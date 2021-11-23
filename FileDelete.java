import java.io.File;
import java.util.Scanner;

public class FileDelete{
	public static void main(String[] args){
		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter File Name: ");
		String fileName = myInput.nextLine();

		File myFile=new File(fileName+".txt");
		if(myFile.exists()){
			myFile.delete();
			System.out.println("File Deleted Successfully!");
		}else{
			System.out.println("No file found of name "+fileName);
		}
	}
}