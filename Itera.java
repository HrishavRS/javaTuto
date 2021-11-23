import java.util.Iterator;
import java.util.ArrayList;

public class Itera{
	public static void main(String[] args){
		ArrayList<String> myList =new ArrayList<String>();
		myList.add("Damnp");
		myList.add("Hris");
		myList.add("Mapp");
		myList.add("Rampp");

		Iterator<String> myIt = myList.iterator();
		System.out.println(myIt.next());
		while(myIt.hasNext()){
			if (myIt.next()=="Rampp"){
				myIt.remove();
				System.out.println("\nRampp was found and removed "+myList);
			}
			else{
				System.out.print("\nRampp is not found yet "+myIt.next());
			}
		}

	}
}