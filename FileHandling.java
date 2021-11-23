
//Creating A File

/*import java.io.File;
import java.io.IOException;

public class FileHandling{
	public static void main(String[] args){
		try{
			File myFile = new File("testFile.txt");
		//  File myFile = new File("E:\\KU\\ThisIsCreatedByAJavaFile.txt");
			if(myFile.createNewFile()){
				System.out.println("File Created:"+myFile.getName());
			} else{
				System.out.println("File already exists");
			}
		} catch(IOException e){
			System.out.println("An Error Occured!");
			e.printStackTrace();
		}
	}
}

*/

//Writing On A File

/*
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling{
	public static void main(String[] args){
		try{
			FileWriter myFile = new FileWriter("test.txt");
			myFile.write("This line is created by a java file");
			myFile.close();
			System.out.println("Successfully Added the line");
		} catch(IOException e){
			System.out.println("Unforseen error caused");
			e.printStackTrace();
		}
	}
}

*/

//Reading From A File


import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling{
	public static void main(String[] args){
		try{
			File myFile= new File("test.txt");
			Scanner myScan = new Scanner(myFile);
			while(myScan.hasNextLine()){
				String data = myScan.nextLine();
				System.out.println(data);
			}
			myScan.close();
		} catch(FileNotFoundException e){
			System.out.println("Error Found!");
			e.printStackTrace();
		}
	}
}