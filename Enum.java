/*public class Enum{
	enum Level{
		LOW,
		MEDIUM,
		HIGH
	}
	public static void main(String[] args){
		Level myVar=Level.LOW;
		System.out.println(myVar);
	}
}
*/

//Enum is often used in Switch statement to check cases

/*
public class Enum{
	enum Sample{
		SAD,
		HAPPY,
		ANGRY
	}
	public static void main(String[] args){
		Sample myEmo= Sample.ANGRY;
		System.out.println(myEmo); 
		switch(myEmo){
			case SAD:
				System.out.println("He is sad");
				break;
			case HAPPY:
				System.out.println("He is Happy");
				break;
			case ANGRY:
				System.out.println("He is Angry");
				break;
		}
	}
}

*/

//Enum has a values() method which iterates through all the values of that enum constants


enum Integers{
	INTS,
	FLOATS,
	STRINGS,
	CHARS
}

public class Enum{
	public static void main(String[] args){
		for(Integers myInt: Integers.values()){
			System.out.println(myInt);
		}
	}
}


