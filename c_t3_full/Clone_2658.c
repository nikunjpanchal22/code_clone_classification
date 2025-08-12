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
    int c, nw = 0, state = OUT;
    do {
        c = getchar ();
        if ( c != EOF) {
            if (c == ' ' || c == '\n' || c == '\t') {
                if (state == IN){
                    state = OUT;
                    putchar ('\n');
                }
            }
            else {
                if (state == OUT){
                    ++nw;
                    state = IN;
                }
                putchar (c);
            }
        }
    }while (c != EOF);
    return 0;
}


