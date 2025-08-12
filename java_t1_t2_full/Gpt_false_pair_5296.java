int findCombinationsCount (int amount, int coins [], int checkFromIndex) {
    if (amount == 0) return 1;
    else if (amount < 0 || coins.length == checkFromIndex) return 0;
    else {
        int withFirstCoin = findCombinationsCount (amount - coins [checkFromIndex], coins, checkFromIndex);
        int withoutFirstCoin = findCombinationsCount (amount, coins, checkFromIndex + 1);
        return withFirstCoin + withoutFirstCoin;
    }
}


int findCombinationsCount (int amount, int coins [], int lastIndex) {
    if (amount == 0) return 1;
    else if (amount < 0 || coins.length == lastIndex) return 0;
    else {
        int includeLast = findCombinationsCount (amount - coins [lastIndex], coins, lastIndex);
        int excludeLast = findCombinationsCount (amount, coins, lastIndex + 1);
        return includeLast + excludeLast;
    }
}
