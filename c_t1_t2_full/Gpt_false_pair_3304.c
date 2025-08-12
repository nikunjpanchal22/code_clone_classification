int main (void) {
    int ch;
    int inWord = FALSE;
    while ((ch = getchar ()) != EOF) {
        if (ch == ' ' || ch == '\n' || ch == '\t') {
            if (inWord) {
                printf ("\n");
            }
            inWord = FALSE;
        }
        else {
            inWord = TRUE;
        }
        if (inWord) {
            putchar (ch);
        }
    }
    return 0;
}



int main (void) {
    int index;
    int characterStatus = FALSE;
    while ((index = getchar ()) != EOF) {
        if (index == ' ' || index == '\n' || index == '\t') {
            if (characterStatus) {
                printf ("\n");
            }
            characterStatus = FALSE;
        }
        else {
            characterStatus = TRUE;
        }
        if (characterStatus) {
            putchar (index);
        }
    }
    return 0;
}
