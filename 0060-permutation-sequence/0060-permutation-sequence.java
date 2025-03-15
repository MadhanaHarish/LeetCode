class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int fact = 1; // Stores (n-1)!
        
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
            fact *= i;
        }

        k--; // Convert to zero-based index
        StringBuilder result = new StringBuilder();
        
        for (int i = n; i >= 1; i--) {
            fact /= i; // Compute (i-1)!
            int index = k / fact;
            result.append(numbers.get(index));
            numbers.remove(index);
            k %= fact; // Reduce k for the next position
        }
        return result.toString();
    }
}
