public class ThisMethods{
	int a;
	int b;

	public void setData(int a, int b){
		this.a=a;				//Used to denote the variables for convinence  
		this.b=b;				// You can use different variables instead of a and b and don't have to use this
	}							//public class ThisMethods{
								//int c;
								//int d;

								//public void setData(int a, int b){
								//	c=a;				  
								//	d=b;				
								//}				

	public static void main(String[] args){
		ThisMethods first= new ThisMethods();
		first.setData(10,2);
		System.out.println(first.a);
		System.out.println(first.b);
	}

}