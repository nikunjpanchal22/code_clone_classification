int main (void) {
    int c, nw = 0, state = OUT;
    while ((c = getchar ()) != EOF) {
        if (c == ' ' || c == '\n' || c == '\t') {
            if (state == IN) {
                state = OUT;
                putchar ('\n');
            }
        }
        else {
            if (state == OUT) {
                state = IN;
                ++nw;
            }
            putchar (c);
        }
    }
    return 0;
}


 int main (void) {
    int c, nw = 0;
    int start = 0;
    while ((c = getchar ()) != EOF) {
        if (c == ' ' || c == '\n' || c == '\t') {
            if (start == 1) {
                start = 0;
                putchar ('\n');
            }
        }
        else {
            if (start == 0) {
                start = 1;
                ++nw;
            }
            putchar (c);
        }
    }
    return 0;
}


