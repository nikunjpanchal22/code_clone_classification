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
    int i;
    srand((unsigned)time(NULL));
    for (i = 0; i < SIZE; i++)
        buffer[i] = (char)(i %10);
    for (i = 0; i < NUMBER; ++i) {
        shuffle (buffer, SIZE);
        while (buffer[0] % 10 == 0)
            shuffle (buffer, SIZE);
        printout(buffer, LENGTH);
    }
    return 0;
}


