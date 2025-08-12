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
        int c;
        int nw = 0;
        int state = OUT;
        while (1) {
            c = getchar();
            if (EOF == c)
            break;
            if (' ' == c || '\n' == c || '\t' == c) {
            if (IN == state)
                state = OUT, putchar ('\n');
            continue;
            }
            if (OUT == state)
            state = IN, ++nw;
            putchar (c);
        }
        return 0;
}


