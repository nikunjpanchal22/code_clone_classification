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
    int character;
    int currentCharIsWord = FALSE;
    while ((character = getchar ()) != EOF) {
        if (character == ' ' || character == '\n' || character == '\t') {
            if (currentCharIsWord) {
                printf ("\n");
            }
            currentCharIsWord = FALSE;
        }
        else {
            currentCharIsWord = TRUE;
        }
        if (currentCharIsWord) {
            putchar (character);
        }
    }
    return 0;
}
