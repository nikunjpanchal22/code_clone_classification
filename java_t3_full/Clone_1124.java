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
    Random generator = new Random();
    for (int i = 0; i < numberOfCards; i++) {
        int j = generator.nextInt(protoDeck.length - i) + i;
        Card temp = deck[i];
        int shift = j;
        while (shift > i) {
            deck[shift] = deck[shift - 1];
            shift--;
        }
        deck[i] = deck[j];
        deck[j] = temp;
    }
}


