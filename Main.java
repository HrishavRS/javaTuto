public class Main{
	static void firstMethod(){
		System.out.println("First Methods");
	}

	public static void main(String[] args){
		int a =10;
		switch (a){
			case 1:
			System.out.println("Hello 1");
			break;
			case 2:
			System.out.println("Hello 2");
			break;
			case 3:
			System.out.println("Hello 3");
			break;
			case 4:
			System.out.println("Hello 4");
			break;
			case 5:
			System.out.println("Hello 5");
			break;
			default:
			System.out.println("This is default");
		}
		/*String[] cars={"Bugati","Lambo","Porche","Hulk"};
		for (String i:cars){
			System.out.println(i);*/

		int[][] twoDimentional={{1,2,3,4,5},{6,7,8,9,10}};
		for (int j=0;j<twoDimentional.length;++j){
			for (int k=0;k<twoDimentional[j].length;++k){
				System.out.println(twoDimentional[j][k]);
			}
		}
		firstMethod();

		}
}