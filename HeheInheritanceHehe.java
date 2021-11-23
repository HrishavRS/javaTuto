class VeryLong{
	void Balls(){
		System.out.println("Weak!");
	}
}

class MyPP extends VeryLong{
	void Balls(){
		System.out.println("BigBoom!");
	}
}

public class HeheInheritanceHehe{
	public static void main(String[] args){
		MyPP myPP = new MyPP();
		VeryLong notMyPP = new VeryLong();
		myPP.Balls();
		notMyPP.Balls();
	}
}