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


 

#define OUT 0
#define IN 1

int main (void) {
    int c, state = OUT;
    size_t nw = 0;
    while ((c = getchar()) != EOF) {
        if (c != ' ' && c != '\n' && c != '\t') {
            state == OUT && (state = IN, ++nw);
            putchar (c);
        } else if (state == IN) {
            state = OUT;
            putchar('\n');
        }
    }
    return 0;
}


