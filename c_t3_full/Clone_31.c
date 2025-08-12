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
    int prevState = -1;
    while ((ch = getchar()) != EOF) {
        if (ch == ' ' || ch == '\n' || ch == '\t') {
            if (prevState == 1) {
                printf ("\n");
            }
            prevState = 0;
        }
        else {
            putchar (ch);
            prevState = 1;
        }
    }
    return 0;
}


