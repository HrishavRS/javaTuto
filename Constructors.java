abstract class Constructors{
	public String fname="Hrishav";
	public int age=25;
	public abstract void study();
}

class Callin extends Constructors{
	public int gradYear=2022;
	public void study(){
		System.out.println("My Name is"+fname+"I am "+age+" old"+"And i graduated on "+gradYear);
	}
}