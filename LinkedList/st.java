import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class st {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0; i<nums2.length;i++){
            if(set.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }

       System.out.println(set2);

       List<Integer> list = new ArrayList<Integer>( set2 );
       int[] array = new int[set2.size()];
       for (int i = 0; i < list.size(); i++) {
        array[i] = list.get(i);
       }

       System.out.println(Arrays.toString(array));

    }
}
