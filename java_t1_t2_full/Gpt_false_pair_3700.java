int findCombinationsCount (int amount, int coins [], int checkFromIndex) {
    if (amount == 0) return 1;
    else if (amount < 0 || coins.length == checkFromIndex) return 0;
    else {
        int withFirstCoin = findCombinationsCount (amount - coins [checkFromIndex], coins, checkFromIndex);
        int withoutFirstCoin = findCombinationsCount (amount, coins, checkFromIndex + 1);
        return withFirstCoin + withoutFirstCoin;
    }
}


int combinationCount (int amount, int coins [], int checkToIndex) {
    if (amount == 0) return 1;
    else if (amount < 0 || coins.length == checkToIndex) return 0;
    else {
        int withLastCoin = combinationCount (amount - coins [checkToIndex], coins, checkToIndex);
        int withoutLastCoin = combinationCount (amount, coins, checkToIndex - 1);
        return withLastCoin + withoutLastCoin;
    }
}
