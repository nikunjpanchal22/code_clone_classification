main () {
    int x = 0xefffffff;
    int y;
    printf ("%x", x);
    y = x & (0x80000000);
    y = y >> 31;
    x = (y & (~x + 1)) + (~y & (x));
    x = x >> 2;
    x = x & (0x3fffffff);
    x = x + x + x;
    x = x >> 2;
    x = x & (0x3fffffff);
    x = (y & (~x + 1)) + (~y & (x));
    printf ("\n%x %d", x, x);
}


 
main () {
    int x = 0xefffffff;
    int y;
    printf ("%x", x);
    y = (x & 0x80000000) >> 31;
    x = ((y & ~x) + 1) + (~y & x);
    x = x >> 2;
    x = x & 0x3fffffff;
    x = x + (x << 1);
    x = x >> 2;
    x = x & 0x3fffffff;
    x = ((y & ~x) + 1) + (~y & x); 
    printf ("\n%x %d", x, x);
}


