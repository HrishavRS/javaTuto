public class Main2{
	static int Methods(int a, int b){
		return(a+b);
	}
	static double Methods(double a, double b){
		return(a+b);
	}

	public static void main(String[] args){
		int num1=Methods(5,6);
		double num2=Methods(1.2,5.3);

		System.out.println(num1);
		System.out.println(num2);
	}
}