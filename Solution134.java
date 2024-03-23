public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalCost = 0, totalGas = 0;
        for (int i = 0; i < n; i++) {
            totalCost += cost[i];
            totalGas += gas[i];
        }
        if (totalCost > totalGas) {
            return -1;
        }
        int start = 0, currGas = gas[0] - cost[0];
        for (int i = 1; i < n; i++) {
            if (currGas < 0) {
                start = i;
                currGas = gas[i] - cost[i];
                continue;
            }
            currGas = currGas + gas[i] - cost[i];
        }
        return start;
    }
}