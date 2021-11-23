import java.util.Scanner;

public class AddTwoNums{

	static int SumTwoNum(int a, int b){
		return (a+b);
	}

	public static void main(String[] args){
		try{
		boolean b=true;	

		while(b){

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your first number:");
		
		Integer myDou1 = myObj.nextInt();
		Integer myDou2 = myObj.nextInt();

		System.out.println(SumTwoNum(myDou1,myDou2));
		System.out.println("\nDo you want another sum? true/false");

		Boolean boo1=myObj.nextBoolean();
		if (boo1==false){
			b=false;
		} 

		}
	} catch (Exception InputMismatchException){
			System.out.println("Input Invalid");
		}

	}

}