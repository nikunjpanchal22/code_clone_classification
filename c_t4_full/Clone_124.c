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
    scanf ("%s", wordToPrint);  
    int len = strlen (wordToPrint) - 1;
    for (index = len; index >= 0; index--) {
        printf ("%c", wordToPrint [index]);
    }
    return 0;
}


