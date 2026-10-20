class Solution {
    public String reversePrefix(String word, char ch) {
        int a = word.indexOf(ch);
        if (a == -1) {
            return word;
        }
        char[] arr = word.toCharArray();
        int start = 0, end = a;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return new String(arr);
    }
}