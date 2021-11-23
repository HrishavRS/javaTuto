//Below is a normal Array in Java

/*public class ArrayList{
	public static void main(String[] args){
		String[] sample={"Hrishav1","Jacob2","Haper3"};
		for(int i=0;i<(sample.length);++i){
			System.out.println(sample[i]);
		}
	}
}
*/

//Below uses ArrayList which is resizable in comparison to normal Array
//Also uses Collection package which we use to sort the arraylist

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ModifiableArray{
	public static void main(String[] args){
		ArrayList<String> sample1 = new ArrayList<String>();
		sample1.add("Hrishav");
		sample1.add("Hass");
		sample1.add("Many");
		sample1.add("Flaws");

		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		Scanner myObj = new Scanner(System.in);
		int moiNum = myObj.nextInt();

		for (int i=0;i<moiNum;i++){
			int moiNums = myObj.nextInt();
			myNumbers.add(moiNums);
		}
		System.out.println(myNumbers);

		for (int i=0;i<(sample1.size());i++){
			System.out.println(sample1.get(i));
		}

		Collections.sort(sample1);

		for (String j:sample1){
			System.out.println(j);
		}
	}
}