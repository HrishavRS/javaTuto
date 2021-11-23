abstract class Part1{
	public String fname="Hrishav";
	public int age=22;
	public abstract void study();

}

class Student extends Main{
	public int graduationYear=2021;
	public void study(){
		System.out.println("Studying all day");
	}
}