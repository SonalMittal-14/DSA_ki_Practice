import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {8,3,5,1,9,4,2};
        for(int i=1; i<arr.length; i++){
            int k=arr[i];
            int j = i;
            while(j>0 && arr[j-1]>k){
                arr[j] = arr[j-1];
                // j--; 
            }
            arr[j] = k;
        }
        System.out.println(Arrays.toString(arr));
    }
}
