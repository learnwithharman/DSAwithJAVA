/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int left = 1;
        int right = n;
        int mid;
        while (left < right){
            mid = left + (right - left)/2;

            boolean isBad = isBadVersion(mid);

            if (isBad){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}