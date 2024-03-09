import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapinJava {
    public static void main(String[] args) {
        Map<Integer,String> pairs=new HashMap<>();
        pairs.put(1,"Ajay");
        pairs.put(2,"KalaiSelvan");
        System.out.println(pairs.keySet());//Key must be Unique 
        for (int i : pairs.keySet()) {
            System.out.println(i +" : " + pairs.get(i));
        }
        //Hashtables
        Map<Integer,String> tables1=new Hashtable<Integer,String>();//Hashtable doesn't follow any order {2=KalaiSelvan, 1=Ajay}
        for (int i=0;i<2;i++) {
            tables1.put(i+1, pairs.get(i+1));
        }
        System.out.println(tables1);
        Map<Integer,String> pairs2=new HashMap<>();//Hashmap follows insertion order {1=Ajay, 2=KalaiSelvan}
        for (int i=0;i<2;i++) {
            pairs2.put(i+1, pairs.get(i+1));
        }
        System.out.println(pairs2);
    }
}
