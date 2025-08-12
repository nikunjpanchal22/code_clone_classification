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
    for (i = 0; i < SIZE; i+=4)
        buffer[i] = 'a';
    for (i = 1; i < SIZE; i+=4)
        buffer[i] = 'b';
    for (i = 2; i < SIZE; i+=4)
        buffer[i] = 'c';
    for (i = 3; i < SIZE; i+=4)
        buffer[i] = 'd'; 
    for (i = 0; i < NUMBER; ++i) {
        shuffle (buffer, SIZE);
        while (buffer[0] == 'a')
            shuffle (buffer, SIZE);
        printout (buffer, LENGTH);
    }
    return 0;
}


