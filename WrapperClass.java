class Stup{
	public static void main(String[] args){
		Integer a=10;
		Double b=12.555;
		Character c='D';

		System.out.println(a.intValue());
		System.out.println(b.doubleValue());
		System.out.println(c.charValue());

		String myString =a.toString();
		System.out.println(myString.length());
	}
}