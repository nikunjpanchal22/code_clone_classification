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
    Random randomGenerator = new Random(); 
    for (int i = 0; i < numberOfCards; i++) { 
        int index = randomGenerator.nextInt(protoDeck.length - i + 1) + i; 
        Card temp = deck[index]; 
        for (int j = index; j > i; j--) deck[j] = deck[j - 1]; 
        deck[i] = temp; 
    } 
} 


