/*class Outer{
	int a=50;

	class Inner{
		public int returnss(){
			return a;	
		}
	}
}

class Main{ //Since there is public before class so name of the class should be the name of the file i.e. InnerClass else can be written anything 
	public static void main(String[] args){
		Outer myInst=new Outer();
		Outer.Inner myInn=myInst.new Inner();
		System.out.println(myInn.returnss());
	}
}*/



//This is another example
/*
class OuterClass{
	int a=10;

	class InnerClass{
		int y=5;
	}
}

class Main{
	public static void main(String[] args){
		OuterClass newInst = new OuterClass();
		OuterClass.InnerClass newInner = newInst.new InnerClass();
		System.out.println("THe total is:"+(newInst.a+newInner.y));
	}
}
*/

class OuterClass{
	int a=120;

	class InnerClass{
		public int hThis(){
			return a;
		}
	}
}

class InnerClass{
	public static void main(String[] args){
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.hThis());
	}
}
