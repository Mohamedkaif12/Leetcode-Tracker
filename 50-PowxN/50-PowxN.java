// Last updated: 7/9/2026, 3:06:48 PM
class Solution {

    public double myPow(double x, int n) {

        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1;

        while (N > 0) {

            if ((N & 1) == 1)
                ans *= x;

            x *= x;
            N >>= 1;
        }

        return ans;
    }
}