import java.util.*;

public class Main
{
    public static void main(String[] args) { 
        int arr[] = {1, 2, 5, 4, 3}; 
        int n = arr.length;
        int temp1[] = new int[n];
        Integer temp2[] = new Integer[n];
        for(int i = 0; i < n; i++){
            temp1[i] = arr[i];
            temp2[i] = arr[i];
        }
        Arrays.sort(temp1);
        Arrays.sort(temp2, Collections.reverseOrder());
        reverse(arr);
        boolean isSame = (Arrays.equals(arr, temp1) || Arrays.equals(arr, toPrimitive(temp2)));
        if(isSame){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
    public static void reverse(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n / 2; i++){
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static int[] toPrimitive(Integer[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}
