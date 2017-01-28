package sortingandseraching;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		System.out.println(binSearch(arr,0,arr.length-1,5));		
	}
	
	//iterative
	int bin_search(int arr[], int left, int right,  int k)
	{
	    while(left <= right){
	        // find the mid pointer
		    int mid = left + (right-left)/2;
		    // if element is equal to the mid element return mid index
		    if(arr[mid] == k)
		    	return mid;
		    // if element is greater than mid element search the element in the right half
		    else if(k > arr[mid])
		    	return bin_search(arr, mid+1, right, k);
		    // if element is less than the mid element search the element in the left half
		    return bin_search(arr, left, mid-1, k);
	    }
	    //no element found -- return -1
        return -1;
	}
	
	//recursive
	static int binSearch(int arr[], int left, int right,  int k)
	{
		//if left > right --no element found return -1
		if(left > right)
			return -1;
		// find the mid pointer
		int mid = left + (right-left)/2;
		// if element is equal to the mid element reuturn mid index
		if(arr[mid] == k)
			return mid;
		// if element is greater than mid element search the element in the right half
		else if(k > arr[mid])
			return binSearch(arr, mid+1, right, k);
		// if element is less than the mid element search the element in the left half
		return binSearch(arr, left, mid-1, k);
	}
}
