class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;
        for (int x : aliceSizes) {
            aliceTotal += x;
        }

        for (int x : bobSizes) {
            bobTotal += x;
        }
        int diff = (aliceTotal - bobTotal) / 2;

        for (int a : aliceSizes) {
            for (int b : bobSizes) {

                if (a - b == diff) {
                    return new int[]{a, b};
                }
            }
        }
        return new int[]{};
    }
}