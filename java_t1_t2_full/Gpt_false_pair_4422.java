public static void main (String [] args) {
    int [] coins = new int [] {1, 2, 3, 4, 5};
    int money = 600;
    int [] [] recorder = new int [money + 1] [coins.length];
    for (int k = 0;
    k < coins.length; k ++) {
        recorder [0] [k] = 1;
    }
    for (int i = 1;
    i <= money; i ++) {
        int with = 0;
        int without = 0;
        for (int coin_index = 0;
        coin_index < coins.length; coin_index ++) {
            if (i - coins [coin_index] < 0) {
                with = 0;
            } else {
                with = recorder [i - coins [coin_index]] [coin_index];
            }
            if (coin_index - 1 < 0) {
                without = 0;
            } else {
                without = recorder [i] [coin_index - 1];
            }
            recorder [i] [coin_index] = with + without;
        }
    }
    System.out.print (recorder [money] [coins.length - 1]);
}


public static void main (String [] args) {
    int [] coins = new int [] {1, 2, 3, 4, 5};
    int money = 800;
    int [] [] recorder = new int [money + 1] [coins.length];
    for (int k = 0;
    k < coins.length; k ++) {
        recorder [0] [k] = 1;
    }
    for (int i = 1;
    i <= money; i ++) {
        int with = 0;
        int without = 0;
        for (int coin_index = 0;
        coin_index < coins.length; coin_index ++) {
            if (i - coins [coin_index] < 0) {
                with = 0;
            } else {
                with = recorder [i - coins [coin_index]] [coin_index];
            }
            if (coin_index - 1 < 0) {
                without = 0;
            } else {
                without = recorder [i] [coin_index - 1];
            }
            recorder [i] [coin_index] = with + without;
        }
    }
    System.out.print (recorder [money] [coins.length - 1]);
}
