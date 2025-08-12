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
    Random randGenerator = new Random();
    for (int i = 0; i < numberOfCards; i++) {
        int j = randGenerator.nextInt(protoDeck.length - i) + i;
        Card temp = deck[i];
        deck[i] = deck[j];
        int k = j;
        while (k > i) {
            deck[k] = deck[k - 1];
            k--;
        }
        deck[i+1] = temp;
    }
}


