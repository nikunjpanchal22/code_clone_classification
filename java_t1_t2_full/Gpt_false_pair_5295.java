int findCombinationsCount (int amount, int coins [], int checkFromIndex) {
    if (amount == 0) return 1;
    else if (amount < 0 || coins.length == checkFromIndex) return 0;
    else {
        int withFirstCoin = findCombinationsCount (amount - coins [checkFromIndex], coins, checkFromIndex);
        int withoutFirstCoin = findCombinationsCount (amount, coins, checkFromIndex + 1);
        return withFirstCoin + withoutFirstCoin;
    }
}



int countCombinations (int total, int coins [], int startIndex) {
    if (total == 0) return 1;
    else if (total < 0 || coins.length == startIndex) return 0;
    else {
        int withFirstCoin = countCombinations (total - coins [startIndex], coins, startIndex);
        int withoutFirstCoin = countCombinations (total, coins, startIndex + 1);
        return withFirstCoin + withoutFirstCoin;
    }
}
