import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int arr[] = {8,4,6,2,9,6,0,1,4,3};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int arr2[] = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            arr2[arr[i]] = arr2[arr[i]]+1;
        }

        for (int i = 0; i < arr2.length; i++) {
            int v = arr2[i];
            while(v>0){
                System.out.print(i+" ");
                v--;
            }
        }

        // System.out.println(Arrays.toString(args));
    }    
}
