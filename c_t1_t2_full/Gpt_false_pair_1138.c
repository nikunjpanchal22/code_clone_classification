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
    bool s = false;
    while ((c = getchar ()) != EOF) {
        if (c == ' ' || c == '\n' || c == '\t') {
            if (s == true) {
                s = false;
                putchar ('\n');
            }
        }
        else {
            if (s == false) {
                s = true;
                ++nw;
            }
            putchar (c);
        }
    }
    return 0;
}
