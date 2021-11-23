public class Recursion2{
	public static void main(String[] args){
		multi(1,0);
	}

	public static void multi(int a,int b){
			System.out.println(a+"x"+b+"="+a*b);
			b=b+1;
			if (b<11){
				multi(a,b);
				if(b==10){
					b=0;
					System.out.println("\n");
					if(a<10){
						multi(a+1,b);	
					}
				}	
			}
	}
}