import java.util.HashSet;

public class Hashset{
	public static void main(String[] args){
		HashSet <String> myHashSet= new HashSet<String>();
		myHashSet.add("Hrishav");
		myHashSet.add("Paul");
		myHashSet.add("Antoine");
		myHashSet.add("Hrishav");

		System.out.println(myHashSet.contains("Paul"));
		System.out.println(myHashSet.contains("Brutus"));

		System.out.println("\n"+myHashSet.size());
		System.out.println("\n"+myHashSet+"\n");
		myHashSet.remove("Paul");
		System.out.println(myHashSet);
		myHashSet.clear();
		System.out.println(myHashSet);



	}
}