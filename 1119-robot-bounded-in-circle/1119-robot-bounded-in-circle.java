import java.util.*;

class Solution {
    public boolean isRobotBounded(String instructions) {
        Map<String, String[]> m = new HashMap<>();
        m.put("North", new String[]{"West", "East"});
        m.put("South", new String[]{"East", "West"});
        m.put("East", new String[]{"North", "South"});
        m.put("West", new String[]{"South", "North"});

        String direction = "North";
        int x = 0, y = 0;

        for (char i : instructions.toCharArray()) {
            if (i == 'L') {
                direction = m.get(direction)[0];
            } else if (i == 'R') {
                direction = m.get(direction)[1];
            } else {
                if (direction.equals("North")) {
                    y++;
                } else if (direction.equals("South")) {
                    y--;
                } else if (direction.equals("East")) {
                    x++;
                } else { 
                    x--;
                }
            }
        }

        return (x == 0 && y == 0) || !direction.equals("North");
    }
}
