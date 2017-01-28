package sortingandseraching;
public class LinearSearch {
	static int search(int arr[], int x)
    {
		int n = arr.length;
		for(int i = 0; i < n; i++){
			//if element is found return the index
			if(arr[i] == x){
				return i;
			}
		}
		//element is not found so return -1
		return -1;
    }
}