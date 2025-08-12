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
    for (i = SIZE - 1; i > 0; --i) {
        random = (rand() % i);
        char temp = buffer[i];
        buffer[i] = buffer[random];
        buffer[random] = temp;
    }
    for (i = 0; i < NUMBER; ++i) {
        do
            shuffle (buffer, SIZE);
        while (buffer[0] == 0);
        printout (buffer, LENGTH);
    }
    return 0;
}


