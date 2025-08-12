int findCombinationsCount (int amount, int coins [], int checkFromIndex) {
    if (amount == 0) return 1;
    else if (amount < 0 || coins.length == checkFromIndex) return 0;
    else {
        int withFirstCoin = findCombinationsCount (amount - coins [checkFromIndex], coins, checkFromIndex);
        int withoutFirstCoin = findCombinationsCount (amount, coins, checkFromIndex + 1);
        return withFirstCoin + withoutFirstCoin;
    }
}






public int findCombinationsCount(int amount, int[] coins, int checkFromIndex, Integer[][] memo) {
    if (amount == 0)
        return 1;
    else if (amount < 0 || coins.length == checkFromIndex)
        return 0;
    else if (memo[amount][checkFromIndex] != null)
        return memo[amount][checkFromIndex];
    else {
        int withFirstCoin = findCombinationsCount(amount - coins[checkFromIndex], coins, checkFromIndex, memo);
        int withoutFirstCoin = findCombinationsCount(amount, coins, checkFromIndex + 1, memo);
        memo[amount][checkFromIndex] = withFirstCoin + withoutFirstCoin;
        return memo[amount][checkFromIndex];
    }
}


