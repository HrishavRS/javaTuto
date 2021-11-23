/*import java.util.ArrayList;

public class Lambdaa{
	public static void main(String[] args){
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		myArray.add(75);
		myArray.add(11);
		myArray.add(52);
		myArray.add(31);
		myArray.add(12);
		myArray.add(15);

		myArray.forEach((n) ->{System.out.println(n);});
	}
}*/

//Lambda expression can be stored in a variable that is of same type 
//Below we use a build-in function Consumer in java that is used to generate a variable "method" of type "Integer" that only works for integer type data

/*
import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambdaa{
	public static void main(String[] args){
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		myArray.add(75);
		myArray.add(11);
		myArray.add(52);
		myArray.add(31);
		myArray.add(12);
		myArray.add(15);

		Consumer<Integer> method = (n) -> {System.out.println(n);};
		myArray.forEach(method);
	}
}
*/

import java.util.function.Consumer;

interface StringFunction{
	String run(String str);
}

public class Lambdaa{
	public static void main(String[] args){
		StringFunction exclaim = (s)->s+"!";
		StringFunction ask = (s)-> s+"?";
		printFormatted("Hello",exclaim);
		printFormatted("Hello",ask);
	}
	public static void printFormatted(String str,StringFunction format){
		String result = format.run(str);
		System.out.println(result);
	}
}