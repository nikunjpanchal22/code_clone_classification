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




public int findCombinationsCount(int amount, int[] coins) {
            return findCombinationsCount(amount, coins, 0);
        }

        public int findCombinationsCount(int amount, int[] coins, int coinNumber) {
            if (coinNumber == coins.length - 1)
                return (amount % coins[coinNumber] == 0) ? 1 : 0;

            int ways = 0;
            for (int times = 0; times * coins[coinNumber] <= amount; times++)
                ways += findCombinationsCount(amount - times * coins[coinNumber], 
                                            coins, coinNumber + 1);
            return ways;
}


