class Solution {
    public boolean isHappy(int n) {
        Set<Integer> ans = new HashSet<>();
        while (n != 1 && !ans.contains(n)) {
            ans.add(n);
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
