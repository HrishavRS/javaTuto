public class OOP{
	int modelYear;
	String modelName;

	public OOP(int year, String name){
		modelYear=year;
		modelName=name;
	}

	public static void main(String[] args){
		OOP myCar=new OOP(2016,"Mustang");
		System.out.println("Year:"+myCar.modelYear);
		System.out.println("Name:"+myCar.modelName);
		myCar.modelName="Ford";
		myCar.modelYear=2010;
		System.out.println("The Car is "+myCar.modelName+" of year "+myCar.modelYear);
	}
}