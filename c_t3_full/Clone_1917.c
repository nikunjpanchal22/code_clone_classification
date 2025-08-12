int main (void) {
    char str [] = "hello big panda";
    int nchars = 0;
    nchars = prnword (str, 0);
    nchars += prnword (str +nchars, 0);
    nchars += prnword (str +nchars, 0);
    putchar ('\n');
    nchars = 0;
    nchars += prnword (str, 3);
    putchar ('\n');
    nchars = 0;
    nchars = prnword (str, 1);
    putchar ('\n');
    return 0;
}


int main (void) {
    char str [] = "hello big panda";
    int nchars = 0;
    nchars = prnword (str, 0);
    nchars += prnword (str +nchars +1, 0);
    nchars += prnword (str +nchars +2, 0);
    putchar ('\n');
    nchars = 0;
    nchars += prnword (str +1, 3);
    putchar ('\n');
    nchars = 0;
    nchars = prnword (str +2, 1);
    putchar ('\n');
    return 0;
}


