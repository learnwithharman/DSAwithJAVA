class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> ans = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {

            boolean greatest = true;

            for (int j = 0; j < candies.length; j++) {

                if (candies[i] + extraCandies < candies[j]) {
                    greatest = false;
                    break;
                }
            }

            ans.add(greatest);
        }

        return ans;
    }
}