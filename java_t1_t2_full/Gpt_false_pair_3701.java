int findCombinationsCount (int amount, int coins [], int checkFromIndex) {
    if (amount == 0) return 1;
    else if (amount < 0 || coins.length == checkFromIndex) return 0;
    else {
        int withFirstCoin = findCombinationsCount (amount - coins [checkFromIndex], coins, checkFromIndex);
        int withoutFirstCoin = findCombinationsCount (amount, coins, checkFromIndex + 1);
        return withFirstCoin + withoutFirstCoin;
    }
}


int countCombinations (int sum, int coinList [], int startFromIndex) {
    if (sum == 0) return 1;
    else if (sum < 0 || coinList.length == startFromIndex) return 0;
    else {
        int withLowerCoin = countCombinations (sum - coinList [startFromIndex], coinList, startFromIndex);
        int withoutLowerCoin = countCombinations (sum, coinList, startFromIndex + 1);
        return withLowerCoin + withoutLowerCoin;
    }
}
