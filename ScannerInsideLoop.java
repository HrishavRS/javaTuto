import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ScannerInsideLoop{
	public static void main(String[] args){
		ArrayList<Integer> myNumbs = new ArrayList<Integer>();

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int number=myObj.nextInt();
		for (int i=0;i<number;i++){
			int number1=myObj.nextInt();
			myNumbs.add(number1);

		}
		System.out.println(myNumbs);
		Collections.sort(myNumbs);
		System.out.println(myNumbs);
	}
}
/*
import java.util.Scanner;

class ReadingFromScanner{
	public static void main(String[] args){
		Scanner myInput= new Scanner(System.in);
		System.out.println("Enter your Name");

		String myName=myInput.nextLine();
		System.out.println("The name is "+myName);
	}
}*/