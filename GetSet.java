public class GetSet{
	private String name="Hrishav";

	public String getName(){
		return name;
	}

	public void setName(String newName){
		this.name=newName;
	}
	public static void main(String[] args){
		GetSet myObj = new GetSet();
		System.out.println(myObj.getName());
		myObj.setName("HrishavRS");
		System.out.println(myObj.getName());
	}
}