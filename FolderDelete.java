import java.io.File;
import java.util.Scanner;

public class FolderDelete{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Folder Name: ");
		String myFolder = myObj.nextLine();

		File myFold = new File(myFolder);
		if(myFold.exists()){
			myFold.delete();
			System.out.println("Folder Deleted\\ The folder must be empty");
		}else{
			System.out.println("No Folder Found of name \""+myFold+"\"");
		}

	}
}