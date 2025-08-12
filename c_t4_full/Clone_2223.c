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
    int nw = 0, state = OUT;
    for (int c; (c = getchar()) != EOF;) {
        ' ' == c || '\n' == c || '\t' == c ? (state == IN && (state = OUT, putchar ('\n'))) : (state == OUT && (++nw, state = IN), putchar (c));
    }
    return 0;
}


