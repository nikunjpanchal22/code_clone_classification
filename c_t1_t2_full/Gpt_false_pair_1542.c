int main (void) {
    int64_t number = 2001000200030LL;
    char data [24];
    char digit [5] = {0}, *p;
    int len, r;
    len = sprintf (data, "%lld", number);
    p = data;
    r = len % 4;
    if (r) {
        strncpy (digit, p, r);
        printf ("%s\n", digit);
        len -= r;
        p += r;
    }
    while (len != 0) {
        strncpy (digit, p, 4);
        printf ("%s\n", digit);
        len -= 4;
        p += 4;
    }
    return 0;
}


 int main (void) {
    int64_t number = 2001000200030LL;
    char data [24];
    char digit [5] = {0}, *p;
    int len, r;
    len = snprintf (data, 24, "%lld", number);
    p = data;
    r = len % 4;
    if (r) {
        memcpy (digit, p, r);
        printf ("%s\n", digit);
        len -= r;
        p += r;
    }
    while (len != 0) {
        memcpy (digit, p, 4);
        printf ("%s\n", digit);
        len -= 4;
        p += 4;
    }
    return 0;
}
