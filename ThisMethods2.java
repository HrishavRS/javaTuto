public class ThisMethods2{
	String company;
	String level;
	int salary;
	int period;

	public void work(String company,String level, int salary, int period){
		this.company=company;
		this.level=level;
		this.salary=salary;
		this.period=period;
	}


	public static void main(String[] args){
		ThisMethods2 news= new ThisMethods2();
		news.work("Deerwalk","Intern",300000,3);
		System.out.println("Company Name="+news.company);
		System.out.println("Level="+news.level);
		System.out.println("Salary="+news.salary);
		System.out.println("Period="+news.period+" Months");

	}
}