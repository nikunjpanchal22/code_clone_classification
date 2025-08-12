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




 

int main () {
    int c, nw = 0, state = OUT;
    while ((c = getchar()) != EOF) {
        (c == ' ' || c == '\n' || c == '\t') ? ((state == IN) ? (state = OUT, putchar('\n')) : 0) : ((state == OUT) ? (state = IN, ++nw) : 0, putchar(c));
    }
    return 0;
}


