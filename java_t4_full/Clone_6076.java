int findCombinationsCount (int amount, int coins []) {
    if (coins.length == 1) {
        return amount % coins [0] == 0 ? 1 : 0;
    } else {
        int total = 0;
        int [] subCoins = arrayOfCoinsExceptTheFirstOne (coins);
        for (int i = 0;
        i * coins [0] <= amount; ++ i) {
            total += findCombinationsCount (amount - i * coins [0], subCoins);
        }
        return total;
    }
}





public class Solution {
    private int findCombinationsCount(int amount, int[] coins, int idx, int[][] dp) {
        if (dp[amount][idx] != -1) 
            return dp[amount][idx]; 

        if (idx == coins.length - 1) 
            return amount % coins[idx] == 0 ? 1 : 0;

        int count = 0;
        for (int i = 0; i <= amount / coins[idx]; i++) 
            count += findCombinationsCount(amount - i * coins[idx], coins, idx + 1, dp);

        dp[amount][idx] = count;
        return count;
    }

    public int findCombinationsCount(int amount, int[] coins) {
        int[][] dp = new int[amount + 1][coins.length];
        for (int[] row : dp) Arrays.fill(row, -1);
        return findCombinationsCount(amount, coins, 0, dp);
    }
}


