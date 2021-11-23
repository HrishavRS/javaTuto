import java.util.LinkedList;

class LinkedLists{
	public static void main(String[] args){
		LinkedList<String> myLink = new LinkedList<String>();
		myLink.add("Hrishav");
		myLink.add("Raghu");
		myLink.add("Shrestha");

		myLink.addFirst("is");
		myLink.addFirst("He");
		myLink.addLast("And");
		
		String d=myLink.getLast();
		String c=myLink.getFirst();
		String b=myLink.removeLast();
		String a=myLink.removeFirst();
		
		System.out.println(myLink);
		System.out.println(b);
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);

	}
}