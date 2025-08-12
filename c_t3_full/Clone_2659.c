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
    int **p;
    p = malloc(sizeof(realloc(0)));
    while ((**p = getchar()) != EOF) {
        if (**p == ' ' || **p == '\n' || **p == '\t') {
            if (state == IN) {
                state = OUT;
                putchar ('\n');
            }
        }
        else {
            if (state == OUT){
                ++nw;
                state = IN;
            }
            putchar (**p);
        }
    }
    return 0;
}


