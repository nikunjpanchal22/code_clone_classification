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
    int c = 0, state = 0, nw = 0;
    while (!feof(stdin)) {
        if ((c = getchar()) == EOF) break;
        if (c == ' ' || c == '\t' || c == '\n') {
            if (state) state = OUT, putchar ('\n');
        } else {
            if (!state) state = IN, ++nw;
            putchar (c);
        }
    }
    return 0;
}


