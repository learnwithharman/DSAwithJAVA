class Solution {
    public boolean checkIfPangram(String s) {

        for (char ch = 'a'; ch <= 'z'; ch++) {

            if (!s.contains(String.valueOf(ch))) {
                return false;
            }
        }

        return true;
    }
}