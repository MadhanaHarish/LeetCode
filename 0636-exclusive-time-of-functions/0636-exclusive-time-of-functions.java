class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] output = new int[n];
        Stack<String> stack = new Stack<>();
        int prev = 0;

        for(String log: logs) {
            String[] input = log.split(":");

            if(input[1].equals("start")) {
                if(!stack.isEmpty()) {
                    int currentStart = Integer.valueOf(input[2]);
                    output[Integer.valueOf(stack.peek())] += currentStart - prev;
                }
                stack.push(input[0]);
                prev = Integer.valueOf(input[2]);
            } 

            if(input[1].equals("end")) {
                int currentEnd = Integer.valueOf(input[2]);
                output[Integer.valueOf(stack.peek())] += currentEnd - prev + 1;
                stack.pop();
                prev = Integer.valueOf(input[2]) + 1;
            }

        }

        return output;
    }
}