class Swap{
	public static void main(String[] args){
		int x=52;
		int y=356;
		System.out.println("x:"+x+" y:"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swap => x:"+x+" y:"+y);

	}
}