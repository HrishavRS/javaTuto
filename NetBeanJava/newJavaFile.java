import java.util.ArrayList;
import java.util.List;

public class newJavaFile{
    static Character[] charArray={'h','r','i','s','h','a','v'};
    static Integer[] intArray={6,3,8,9,4,2,4};
    static Boolean[] boolArray={true,false,true,true,false};
    
    public static <T>List<T> arrayToList(T[] array,List<T> list){
        for (T object:array){
        list.add(object);
        }
        return list;
    }
    
    public static void main(String[] args){
        List<Character> charList= arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList=arrayToList(boolArray,new ArrayList<>());
        List<Integer> intList=arrayToList(intArray,new ArrayList<>());
        System.out.print(intList);
    }
}