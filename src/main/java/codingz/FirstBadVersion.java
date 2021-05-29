package codingz;

/*

https://leetcode.com/problems/first-bad-version/

278. First Bad Version

 */
public class FirstBadVersion extends VersionControl  {
    public int firstBadVersion(int n) {
        if (n == 1) {
            return 1;
        }
        int min = n, start = 1, end = n;
        while(start<=end){
            int mid = (start + end)/2;
            if(isBadVersion(mid)) {
                min = Math.min(mid, min);
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return min;
    }
}
