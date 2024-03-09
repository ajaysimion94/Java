import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInsJava {
    public static void main(String[] args) {
        Collection<Integer> nums1=new ArrayList<Integer>();
        nums1.add(6);
        nums1.add(7);
        System.out.println(nums1);
        for (  int i: nums1) {
            System.out.println(i);            
        }
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(89);
        System.out.println("Value at index 0: " + nums.get(0) +" | "+"Index of value 89: "+ nums.indexOf(89));
        System.out.println(nums);
        // Object[] arr=new Object[3];
        // arr=nums.toArray();
        // for (Object i : arr) {
        //     System.out.println(i + " as Array.");
            
        // }
        int[] arr=new int[3];
        for(int i=0; i<3;i++){
            arr[i]=nums.get(i);
        }
        for (int i : arr) {
            System.out.println(i + " as Array.");
            
        }

    }
}
