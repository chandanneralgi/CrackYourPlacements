import java.util.*;
class Main {
    public static boolean isPossible(Integer a[], Integer b[], int n, int k){
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        for (int i = 0; i < n; i++)
            if (a[i] + b[i] < k)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Integer a[] = {2, 1, 3};
        Integer b[] = {7, 8, 9};
        int k = 10;
        int n = a.length;

        if (isPossible(a, b, n, k))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}

