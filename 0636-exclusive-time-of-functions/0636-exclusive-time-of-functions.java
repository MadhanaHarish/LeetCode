class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] output = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prev = 0;

        for(String log : logs) {
            String[] input = log.split(":");
            int id = Integer.parseInt(input[0]);
            int time = Integer.parseInt(input[2]);

            if(input[1].equals("start")) {
                if(!stack.isEmpty()) {
                    output[stack.peek()] += time - prev;
                }
                stack.push(id);
                prev = time;
            } 
            else { // end
                output[stack.peek()] += time - prev + 1;
                stack.pop();
                prev = time + 1;
            }
        }

        return output;
    }
}
