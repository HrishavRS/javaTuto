class Car{
	String brand ="Ford";
	String edition="2020 summer";
	public void honk(){
		System.out.println("Smoooo!");
	}
}


class Fordsub extends Car{
	private String modelName="Ford-Wasp";
	public void honk(){
		System.out.println("Peep!!");
	}
	public static void main(String[] args){
		Fordsub myCar = new Fordsub();
		myCar.honk();
		System.out.println("The company is "+myCar.brand+"\nEdition:"+myCar.edition+"\nModel:"+myCar.modelName);
	}
}