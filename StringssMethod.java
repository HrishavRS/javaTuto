public class StringssMethod{
	public static void main(String[] args){
		String firstName="Hrishav";
		String middleName="Raghu";
		String lastName="Shrestha";

		String fullName=(firstName.concat(middleName.concat(lastName)));
		System.out.println(fullName);

		String para="             This is an attempt to remove white space by using .trim() method ";
		System.out.println(para.trim());

		String mapp="Hrishav";
		String mapp1=(mapp.toUpperCase());
		System.out.println(mapp1);


		String[] array= mapp1.split("h",5);

		for(String a: array){
			System.out.println(a);
	
		}
	}
}