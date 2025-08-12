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
    int whiteSpace = TRUE;
    while ((ch = getchar()) != EOF) {
        if (ch == ' ' || ch == '\n' || ch == '\t') {
            whiteSpace = TRUE;
            if (whiteSpace == TRUE) {
                printf ("\n");
            }
        }
        else {
            whiteSpace = FALSE;
            putchar (ch);
        }
    }
    return 0;
}
