class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        if (n == 0) return new long[0];

        long[] result = new long[n];
        Arrays.fill(result, 1);

        long prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        long suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
	} 
} 