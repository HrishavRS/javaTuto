abstract class File{
	public String Name="Hrishav";
	public int age=22;
	public String College="KU";
}

class Student extends File{
	public int graduation = 2020;
	public void study(){
		System.out.println("This is Hrishav");
	}
}

class Second{	
public static void main(String[] args){
	Student myObj=new Student();
	System.out.println(myObj.graduation);
	myObj.study();
}

}