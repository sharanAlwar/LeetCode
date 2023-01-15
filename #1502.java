class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int d=arr[1]-arr[0];
        int count=0;
        for(int i=0;i<n-1;i++){
            if((arr[i+1]-arr[i])==d){
                count++;
            }
        }
        if(count==n-1)
        return true;
        else
        return false;
    }
}
