/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                // mid bad hai
                // first bad mid ya uske left mein ho sakta hai
                end = mid;

            } else {

                // mid good hai
                // first bad definitely right mein hai
                start = mid + 1;
            }
        }
        return start;
    }
}