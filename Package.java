import java.util.Scanner;

class Package{
	public static void main(String[] args){
		Scanner myObj=new Scanner(System.in); //creating instance of imported package i.e. Scanner
		System.out.println("Enter your DOB year:");
		int dOB=myObj.nextInt(); //.nextInt() is for integer .nextLine() is for Strings
		System.out.println("You are "+(2021-dOB)+" years old");
	}
}