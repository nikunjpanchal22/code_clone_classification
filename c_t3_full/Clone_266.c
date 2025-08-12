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
    int index;
    char wordToPrint [SIZE];
    printf ("please enter a random word:\n");
    scanf (" %[^\n]s", wordToPrint);
    int len = strlen (wordToPrint);
    for (index = 0; index < len / 2; index++) {
        char temp = wordToPrint[index];
        wordToPrint[index] = wordToPrint[len - index - 1];
        wordToPrint[len - index - 1] = temp;
    }
    printf("%s", wordToPrint);
    return 0;
}


