import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferReaderss{
	public static void main(String[] args){
		try{
		Scanner a= new Scanner(System.in);
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your String");
		String an= a.nextLine();
		System.out.println("Enter your buffered String");
		String bn = b.readLine();
		System.out.println("Enter your buffered number");
		int bi=Integer.parseInt(b.readLine());
		System.out.println("Enter your number");
		int ai=a.nextInt();
		System.out.println("Enter your normal String");
		String ann= a.nextLine();
		System.out.println("Enter number");
		int aii=a.nextInt();

		System.out.println(an); 
		System.out.println(bn);
		System.out.println(bi);
		System.out.println(ai);
		System.out.println(ann);
		System.out.println(aii);

		}catch(IOException e){
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
		
	}
}