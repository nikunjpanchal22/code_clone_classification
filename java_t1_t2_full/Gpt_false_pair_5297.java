int findCombinationsCount (int amount, int coins [], int checkFromIndex) {
    if (amount == 0) return 1;
    else if (amount < 0 || coins.length == checkFromIndex) return 0;
    else {
        int withFirstCoin = findCombinationsCount (amount - coins [checkFromIndex], coins, checkFromIndex);
        int withoutFirstCoin = findCombinationsCount (amount, coins, checkFromIndex + 1);
        return withFirstCoin + withoutFirstCoin;
    }
}


int countCombinations (int amount, int coins [], int startFromIndex) {
    if (amount == 0) return 1;
    else if (amount < 0 || coins.length == startFromIndex) return 0;
    else {
        int withFirstCoin = countCombinations (amount - coins [startFromIndex], coins, startFromIndex);
        int withoutFirstCoin = countCombinations (amount, coins, startFromIndex + 1);
        return withFirstCoin + withoutFirstCoin;
    }
}
