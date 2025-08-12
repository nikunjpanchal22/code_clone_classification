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
    nchars = prnword (str, 5);
    nchars += prnword (str +nchars +5, 0);
    nchars += prnword (str +nchars +10, 0);
    putchar ('\n');
    nchars = 0;
    nchars += prnword (str +9, 3);
    putchar ('\n');
    nchars = 0;
    nchars = prnword (str +14, 1);
    putchar ('\n');
    return 0;
}


