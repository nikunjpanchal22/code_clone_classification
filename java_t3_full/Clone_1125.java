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
        int shiftPos = j;
        while (shiftPos > i) {
            deck[shiftPos] = deck[shiftPos - 1];
            shiftPos--;
        }
        deck[i] = deck[j];
        deck[j] = temp;
    }
}


