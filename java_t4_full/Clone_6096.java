int findCombinationsCount (int amount, int coins [], int checkFromIndex) {
    if (amount == 0) return 1;
    else if (amount < 0 || coins.length == checkFromIndex) return 0;
    else {
        int withFirstCoin = findCombinationsCount (amount - coins [checkFromIndex], coins, checkFromIndex);
        int withoutFirstCoin = findCombinationsCount (amount, coins, checkFromIndex + 1);
        return withFirstCoin + withoutFirstCoin;
    }
}






public int findCombinationsCount(int amount, int[] coins, int checkFromIndex) {
    if (amount == 0)
        return 1;
    else if (amount < 0 || coins.length == checkFromIndex)
        return 0;
    else {
        return 
            findCombinationsCount(amount - coins[checkFromIndex], coins, checkFromIndex)
            + findCombinationsCount(amount, coins, checkFromIndex + 1);
    }
}


