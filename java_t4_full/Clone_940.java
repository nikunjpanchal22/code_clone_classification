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
    int j = 0;
    Random rand = new Random();
    for (int i = 0; i < numberOfCards; i++) {
        j = rand.nextInt(protoDeck.length - i) + i;
        Card temp = deck[i];
        deck[i] = deck[j];
        while (j > i + 1) {
          deck[j] = deck[j - 1];
          j--;
        }
        deck[i+1] = temp;
    }
}


