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
    nchars = prnword (str, 7);
    nchars += prnword (str +nchars + 4, 0);
    nchars += prnword (str +nchars + 7, 0);
    putchar ('\n');
    nchars = 0;
    nchars += prnword (str +3, 3);
    putchar ('\n');
    nchars = 0;
    nchars = prnword (str +6, 1);
    putchar ('\n');
    return 0;
}


