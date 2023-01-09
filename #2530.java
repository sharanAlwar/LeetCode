class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Double> heap=new PriorityQueue<>(Collections.reverseOrder());
        double score=0;
        for(double x:nums) heap.add(x);
        for(int i=0;i<k;i++){
            double t=heap.remove();
            score+=t;
            t=Math.ceil(t/3);
            heap.add(t);
        }
        return (long)score;
    }
}
