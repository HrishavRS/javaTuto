import java.util.ArrayList;

public class bubble2{
	public static void main(String[] args){
		ArrayList<Integer> newArr= new ArrayList<Integer>();
		newArr.add(56);
		newArr.add(22);
		newArr.add(45);
		newArr.add(05);
		newArr.add(75);
		newArr.add(84);
		newArr.add(99);
		newArr.add(98);
		System.out.println(newArr);

		for(int i=0;i<newArr.size();i++){
			for(int j=i+1;j<newArr.size();j++){
				if(newArr.get(i)>newArr.get(j)){
					int temp=newArr.get(i);
					newArr.set(i,newArr.get(j));
					newArr.set(j,temp);
				}
			}
		}
		System.out.println(newArr);

	}
}