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
    Random rand = new Random();
    for (int i = 0; i < numberOfCards; i++) {
        int j = rand.nextInt(protoDeck.length - i) + i;
        Card temp = deck[i];
        deck[i] = deck[j];
        int position = j;
        while (position > i) {
            deck[position] = deck[position - 1];
            position--;
        }
        deck[i+1] = temp;
    }
}


