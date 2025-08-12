int findCombinationsCount (int amount, int coins [], int checkFromIndex) {
    if (amount == 0) return 1;
    else if (amount < 0 || coins.length == checkFromIndex) return 0;
    else {
        int withFirstCoin = findCombinationsCount (amount - coins [checkFromIndex], coins, checkFromIndex);
        int withoutFirstCoin = findCombinationsCount (amount, coins, checkFromIndex + 1);
        return withFirstCoin + withoutFirstCoin;
    }
}



int findCombosCount (int sum, int coins [], int checkIndex) {
    if (sum == 0) return 1;
    else if (sum < 0 || coins.length == checkIndex) return 0;
    else {
        int withFirstCoin = findCombosCount (sum - coins [checkIndex], coins, checkIndex);
        int withoutFirstCoin = findCombosCount (sum, coins, checkIndex + 1);
        return withFirstCoin + withoutFirstCoin;
    }
}
