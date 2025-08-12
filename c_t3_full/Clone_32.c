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
    int prevChar = '\0';
    while ((ch = getchar()) != EOF) {
        if (ch == ' ' || ch == '\n' || ch == '\t' || (ch == prevChar)) {
            if (prevChar != '\0') {
                printf ("\n");
            }
        }
        else {
            putchar (ch);
        }
        prevChar = ch;
    }
    return 0;
}


