import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetinJava {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<Integer>();
        set1.add(45);
        set1.add(86);
        set1.add(34);
        set1.add(45);//Repeated value won't be visible in set
        System.out.println(set1);
        // To have sorted set
        Set<Integer> set2=new TreeSet<>();
        for (Integer i : set1) {
            set2.add(i);
        }
        System.out.println(set2);
    }
    
}
