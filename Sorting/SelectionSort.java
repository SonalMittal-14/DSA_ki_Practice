import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {8,4,3,8,9,1,6,5};
        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i; j<arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int swap = arr[min];
            arr[min] = arr[i];
            arr[i] = swap;
        }
        System.out.println(Arrays.toString(arr));
    }
}
