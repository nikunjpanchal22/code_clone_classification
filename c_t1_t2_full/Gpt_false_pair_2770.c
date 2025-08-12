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
    int position;
    char wordToPrintOut [SIZE];
    printf ("please enter a random word:\n");
    for (position = 0; position < SIZE; position++) {
        scanf ("%c", & wordToPrintOut [position]);
    }
    int wordLen = strlen (wordToPrintOut);
    for (position = 0; position < SIZE; position++) {
        --wordLen;
        printf ("%c", wordToPrintOut [wordLen - 1]);
    }
    return 0;
}
