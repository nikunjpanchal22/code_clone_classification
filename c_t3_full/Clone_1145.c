int main () {
    char buffer [SIZE];
    int i;
    srand ((unsigned) time (NULL));
    for (i = 0; i < SIZE; ++i)
        buffer[i] = (char) i;
    for (i = 0; i < NUMBER; ++i) {
        do
            shuffle (buffer, SIZE);
        while (buffer[0] == 0);
        printout (buffer, LENGTH);
    }
    return 0;
}


 int main () {
    char buffer [SIZE];
    int i, random;
    srand ((unsigned) time (NULL));
    for (i = 0; i < SIZE; ++i)
        buffer[i] = (char) i;
    for (i = 0; i < NUMBER; ++i) {
        do {
            for (int j = 0; j < SIZE; j++) {
                random = rand() % SIZE;
                char temp = buffer[random]; 
                buffer[random] = buffer[j];
                buffer[j] = temp;
            }
        }
        while (buffer[0] == 0);
        printout (buffer, LENGTH);
    }
    return 0;
}


