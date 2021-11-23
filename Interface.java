//Interface is used for complete abstractions

interface Thisissample{
	public void animalSound();
	public void run();
	public void samplee();
}

interface Thisissample2{
	public void quality();
}

class Pig implements Thisissample,Thisissample2{ //Methods of interface class are interitated by using implements keyword instead of extends
	public void animalSound(){
		System.out.println("Yarppppp!!!");
	}
	public void run(){
		System.out.println("Ruuuuuuuuu!");
	}
	public void samplee(){
		System.out.println("shit!");
	}
	public void quality(){
		System.out.println("qualiii!!!");
	}
}


class Dadss extends Pig{
	public void sssnnn(){
		System.out.println("ssssnnn");
	}
}

class Son extends Dadss{
}

public class Interface{
	public static void main(String[] args){
		Dadss newDad=new Dadss();
		Pig newPig=new Pig();
		Son newSon=new Son();
		newPig.animalSound();
		newPig.run();
		newPig.samplee();
		newSon.sssnnn();
		newDad.sssnnn();
	}
}