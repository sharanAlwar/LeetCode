class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] arr = new int[n1+n2];

        for(int i=0;i<n1;i++){
            arr[i]=nums1[i];
        }
        int j=0;
        for(int i=n1;i<arr.length;i++){
            arr[i]=nums2[j];
            j++;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        double sum=0;
        int n = arr.length;
        if(n%2==0){//even
            sum=(arr[n/2-1]+arr[n/2]);
            sum=sum/2;
            return sum;
        }else {//odd
            sum=(double)arr[n/2];
            return sum;
        }
//        sum = 123;
//        return sum;
    }
}
