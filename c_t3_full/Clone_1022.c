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
    int started = 0;
    while ((c = getchar ()) != EOF) {
        if (c == ' ' || c == '\n' || c == '\t') {
            if (started == 1) {
                started = 0;
                putchar ('\n');
            }
        }
        else {
            if (started == 0) {
                started = 1;
                ++nw;
            }
            putchar (c);
        }
    }
    return 0;
}


