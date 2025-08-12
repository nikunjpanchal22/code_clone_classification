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
    int c;
    int nw = 0;
    int state = OUT;
    while (EOF != (c = getchar())) {
        if (c == ' ' || c == '\n' || c == '\t') {
            if (IN == state) {
                state = OUT;
                putchar ('\n');
            }
        }
        else {
            if (OUT == state){
                ++nw;
                state = IN;
            }
            putchar (c);
        }
    }
    return 0;
}


