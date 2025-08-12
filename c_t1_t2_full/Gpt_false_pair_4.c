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


 int main (void)
{
    int ch;
    int afterSpace = FALSE;
    while ((ch = getchar()) != EOF) {
        if (ch == ' ' || ch == '\n' || ch == '\t') {
            if (afterSpace) {
                printf ("\n");
            }
            afterSpace = TRUE;
        }
        else {
            afterSpace = FALSE;
            putchar (ch);
        }
    }
    return 0;
}
