import java.util.ArrayList;
import java.util.Scanner;

public class Bubble{
	public static void main(String[] args){
		ArrayList<Integer> newArray= new ArrayList<Integer>();
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter the Size of Array");
		int nums1 = myObj.nextInt();
		if(nums1<=0){
			System.out.println("Invalid Size");
		}
		else{
			if(nums1>35){
				System.out.println("Too Large Size");
			}
			else{
				for(int i=0;i<nums1;i++){
					System.out.println("Enter the "+(i+1)+" number");
					int input1 = myObj.nextInt();
					newArray.add(input1);
				}


					System.out.println("\nYour Array(Unsorted:)"+newArray);

					System.out.println("\nIt has size:"+newArray.size());
					for(int i1=0;i1<newArray.size();i1++){
						for(int j=i1+1;j<newArray.size();j++){
							if(newArray.get(i1)>newArray.get(j)){
								int temp=newArray.get(i1);
								newArray.set(i1,newArray.get(j));
								newArray.set(j,temp);
							}
						}
					}
					System.out.println("\nYour Array(Sorted:)"+newArray);
			}
		}

	}

}