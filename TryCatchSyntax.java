import java.util.Scanner;

class tryCatch{
	public static void main(String[] args){
		try{
			String[] myStr={"Hri","sh","a","v","Rag","h","u"};

			System.out.println(myStr.length);
			for(int i=0;i<=7;i++){
				System.out.println(myStr[i]);
			}
		} catch(Exception e){
			System.out.println("There is Error");
		} finally{
			System.out.println("Try and Catch was induced in the program");
		}
	}
}

//Above code and below code are different

class ThrowExp{
	static void checkAge(int a){
		if (a<18){
			//throw new ArithmeticException("Not old enough - Access Denied");
			System.out.println("Young");
		}
		else if(a>=18){
			System.out.println("Access Granted");
		}
	}

	static void askAge(){
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter your age:");
		int myAge=myObj.nextInt();
		checkAge(myAge);					
	}
	public static void main(String[] args){
		boolean d=true;
		while(d){
			Scanner myObj2=new Scanner(System.in);
			askAge();		
			System.out.println("Do you want to go again? Y/N");
			String myChar=myObj2.nextLine();
			if(myChar=="N" || myChar=="n"){
				System.out.println("End of Line");
				d=false;
			}
			else{
				askAge();
			}

		}
	}
}