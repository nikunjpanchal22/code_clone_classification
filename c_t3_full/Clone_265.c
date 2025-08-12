int main (void) {
    int index;
    char wordToPrint [SIZE];
    printf ("please enter a random word:\n");
    for (index = 0; index < SIZE; index++) {
        scanf ("%c", & wordToPrint [index]);
    }
    int len = strlen (wordToPrint);
    for (index = 0; index < SIZE; index++) {
        --len;
        printf ("%c", wordToPrint [len - 1]);
    }
    return 0;
}


 int main (void) { 
    char wordToPrint [SIZE];
    printf ("please enter a random word:\n");
    scanf ("%s", wordToPrint);
    char temp [SIZE];
    int index;
    for (index = 0; index < SIZE; index++) {
        temp[index] = wordToPrint[index];
    }
    int len = strlen(wordToPrint);
    for (index = 0; index < SIZE; index++) {
        wordToPrint[index] = temp[len-1-index];
    }
    printf("%s", wordToPrint);
    return 0;
}


