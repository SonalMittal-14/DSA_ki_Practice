import java.util.Arrays;

public class CountSort1 {
    public static void main(String[] args) {
        int arr[] = {8,4,2,4,5,8,7,9,6,8,1,2};
        int n = arr.length;
        int count[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i-1];
        }

        int result[] = new int[arr.length];
        int len = arr.length-1;
        System.out.println(len);
        while(len >= 0){
            count[arr[len]]--;
            result[count[arr[len]]] = arr[len];
            len--;
        }

        System.out.println(Arrays.toString(result));
    }
}
