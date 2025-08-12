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
    Random random = new Random();
    for (int i = 0; i < numberOfCards; i++) {
        int j = random.nextInt(protoDeck.length - i) + i;
        Card temp = deck[i];
        int pos = j;
        while (pos > i + 1) {
            deck[pos] = deck[pos - 1];
            pos--;
        }
        deck[i] = deck[j];
        deck[j] = temp;
    }
}


