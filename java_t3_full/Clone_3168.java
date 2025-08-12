int findCombinationsCount (int amount, int coins [], int checkFromIndex) {
    if (amount == 0) return 1;
    else if (amount < 0 || coins.length == checkFromIndex) return 0;
    else {
        int withFirstCoin = findCombinationsCount (amount - coins [checkFromIndex], coins, checkFromIndex);
        int withoutFirstCoin = findCombinationsCount (amount, coins, checkFromIndex + 1);
        return withFirstCoin + withoutFirstCoin;
    }
}


 

private int findCombinationsCount (int amount, int coins [], int checkFromIndex) {
    if(amount == 0)
        return 1;
    else if (amount < 0 || checkFromIndex == coins.length)
        return 0;
    int withFirstCoin = findCombinationsCount(amount - coins[checkFromIndex], coins, checkFromIndex);
    int withoutFirstCoin = findCombinationsCount(amount, coins, checkFromIndex + 1);
    return withFirstCoin + withoutFirstCoin;
}


