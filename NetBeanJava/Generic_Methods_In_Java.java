package genetic_methods;

import java.util.ArrayList;
import java.util.List;

public class Generic_Methods_In_Java{
    static Character[] charArray={'h','r','i','s','h','a','v'};
    static Integer[] intArray={5,6,9,3,5,66,42,4};
    static Boolean[] boolArray={true,false,true,true,false};
    
    public static <T> List<T> arrayToList(T[] array, List<T> list){  //<T> is using generic method to show the compiler the error when implementing change of method type(e.g. Integer,String,Boolean,Character) to another method type, which doesn't appear if generic method is not used yet doesn't work.
        for (T object:array){
            list.add(object);
        }
        return list;
    }
    
    
    public static void main(String[] args){
        List<Character> charList = arrayToList(charArray,new ArrayList<>());
        System.out.println(charList);
    }
}