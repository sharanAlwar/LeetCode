class Solution {
    public int search(int[] arr, int target) {
        int low  = 0;
		int high = arr.length-1;
		int middle;
		while(low <= high) {
			middle = low + (high - low)/2;
			if(arr[middle]<target) {
				low = middle+1;
			}else if(arr[middle] > target) {
				high = middle-1;
			}else {
				return middle;
			}
		}
		return -1;
	}
}
