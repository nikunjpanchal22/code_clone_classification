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
        buffer[i] = (char)((i % 26) + 65);
    for (i = 0; i < NUMBER; ++i) {
        do
            shuffle (buffer, SIZE);
        while (buffer[0] == 65);
        printout (buffer, LENGTH);
    }
    return 0;
}
