class Main
{
	public static int ceilSearch(int arr[], int low, int high, int x)
	{
	    int i; 
	
	    if(x <= arr[low])
		    return low; 
		
	    for(i = low; i < high; i++){
		    if(arr[i] == x)
		        return i;
		    if(arr[i] < x && arr[i+1] >= x)
		        return i+1;
	    }		 
	    return -1;
	}
	
	public static void main (String[] args){
	    int arr[] = {1, 2, 8, 10, 10, 12, 19};
	    int n = arr.length;
	    int x = 3;
	    int index = ceilSearch(arr, 0, n-1, x);
	    if(index == -1)
		    System.out.println("Ceiling of "+x+" doesn't exist in array");
	    else
		    System.out.println("ceiling of "+x+" is "+arr[index]);
	} 
}
