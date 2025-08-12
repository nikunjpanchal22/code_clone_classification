public void shuffle (int numberOfCards) {
    for (int i = 0;
    i < numberOfCards; i ++) {
        int j = rand.nextInt (protoDeck.length - i) + i;
        Card tmp = deck [i];
        deck [i] = deck [j];
        deck [j] = tmp;
    }
}


 
public void shuffle(int numberOfCards) {
    Random rng = new Random();
    for (int i = 0; i < numberOfCards; i++) {
        int j = rng.nextInt(protoDeck.length - i) + i;
        Card temp = deck[i];
        deck[i] = deck [j];
        for (int k = j; k > i; k--) deck[k] = deck[k -1];
        deck[i+1] = temp;
    }
}


