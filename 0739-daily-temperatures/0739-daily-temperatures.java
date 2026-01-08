class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> indexStack = new Stack<>();

        indexStack.push(0);

        for(int i = 1; i < temperatures.length; i++) {
            while(!indexStack.isEmpty() && temperatures[indexStack.peek()] < temperatures[i]) {
                temperatures[indexStack.peek()] = i - indexStack.peek();
                indexStack.pop();
            }
            indexStack.push(i);
        }

        while(!indexStack.isEmpty()) {
            temperatures[indexStack.pop()] = 0; 
        }
        return temperatures;
    }
}