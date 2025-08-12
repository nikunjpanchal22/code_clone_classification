public void shuffle (int numberOfCards) {
    for (int i = 0;
    i < numberOfCards; i ++) {
        int j = rand.nextInt (protoDeck.length - i) + i;
        Card tmp = deck [i];
        deck [i] = deck [j];
        deck [j] = tmp;
    }
}


public void shuffle (int numberOfCards) {
    for (int i = 0;
    i < numberOfCards; i ++) {
        int j = Math.abs (rand.nextInt (protoDeck.length - i) + i);
        Card tmp = deck [i];
        deck [i] = deck [j];
        deck [j] = tmp;
    }
}
