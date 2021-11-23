/*public class ThreadingInJava implements Runnable{
	public void run(){
		System.out.println("THis is running in thread");
	}


	public static void main(String[] args){
		ThreadingInJava myObj = new ThreadingInJava();
		myObj.run();
		System.out.println("This is running outside the thread");

	}
}*/

/*
public class ThreadingInJava extends Thread{
	public static int a=0;
	public void run(){
		a++;
	}
	public static void main(String[] args){
		ThreadingInJava news= new ThreadingInJava();
		news.start();
		System.out.println(a);
		a++;
		System.out.println(a);
	}
}
*/

//The Above threading code will cause concurrency problem which means there is no way to 
//check if variable "a" is used by main or threads so we use isAlive() method which is shown below;

public class ThreadingInJava extends Thread{
	public static int a=0;
	
	public void run(){
		a++;
	}

	public static void main(String[] args){
		ThreadingInJava myObj = new ThreadingInJava();
		myObj.start();

		while(myObj.isAlive()){
			System.out.println("Waiting...");
		} //Below code will not run until "myObj.isAlive()==false" which acts like a barrier which was not in above code;
		System.out.println(a);
		a++;
		System.out.println(a);
	}
}