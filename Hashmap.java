import java.util.HashMap;

public class Hashmap{
	public static void main(String[] args){
		HashMap <String,String> myHash = new HashMap<String,String>();
		myHash.put("Hrishav","Hetauda");
		myHash.put("Daminan","Gotham");
		myHash.put("Paul","Arakis");
		System.out.println(myHash.keySet());
		System.out.println(myHash.values());
		System.out.println(myHash.size());
		
		for (String i: myHash.values()){
			System.out.println(i);
		}
		//myHash.clear();
		//System.out.println(myHash);
		//System.out.println(myHash.get("Hrishav"));
	}

}