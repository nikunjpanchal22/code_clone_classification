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
            for (int j = SIZE - 1; j > 0; j--) {
                random = (rand() % (j + 1));
                char tmp = buffer[j]; 
                buffer[j] = buffer[random];
                buffer[random] = tmp;
            }
        }
        while (buffer[0] == 0);
        printout (buffer, LENGTH);
    }
    return 0;
}


