/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1,r=n;
        while(r>=l)
        {
            int mid=l+(r-l)/2;
            boolean res=isBadVersion(mid);
            
            if(res)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }


        }
        return l;

    }
}
