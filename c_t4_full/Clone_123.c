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
    int i, j;
    for (i = 0, j = strlen(wordToPrint) - 1; i < strlen(wordToPrint); i++, j--) {
        temp[i] = wordToPrint[j];
    }
    temp [strlen(wordToPrint) + 1] = '\0';
    printf("%s", temp);
    return 0;
}


