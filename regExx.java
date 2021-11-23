import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.DateAndTime;

public class regExx{
	public static void main(String[] args){
		Pattern patts=Pattern.compile("sample",Pattern.CASE_INSENSITIVE);
		Matcher matchf=patts.matcher("This is the place");
		boolean matchtr=matchf.find();

		if(matchtr){
			System.out.println("There was a hit");
		}
		else{
			System.out.println("No hit");
		}
	}
}