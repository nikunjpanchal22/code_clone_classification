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
    int i,j;
    srand ((unsigned) time (NULL));
    for (i = 0; i < SIZE; ++i)
        buffer[i] = (char) i; 
    for (i = 0; i < NUMBER; ++i) {
        for (j = SIZE - 1; j > 0; j--) {
            int random = (rand() % j);
            char tmp = buffer[j];
            buffer[j] = buffer[random];
            buffer[random] = tmp;
        }
        printout (buffer, LENGTH);
    }
    return 0;
}


