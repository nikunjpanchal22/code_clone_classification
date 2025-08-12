int main () {
    static int x = 5;
    static int *p = &x;
    printf ("(int) p   => %d\n", (int) p);
    printf ("(int) p++ => %d\n", (int) p ++);
    x = 5;
    p = &x;
    printf ("(int) ++p => %d\n", (int) ++ p);
    x = 5;
    p = &x;
    printf ("++*p      => %d\n", ++ * p);
    x = 5;
    p = &x;
    printf ("++(*p)    => %d\n", ++ (* p));
    x = 5;
    p = &x;
    printf ("++*(p)    => %d\n", ++ * (p));
    x = 5;
    p = &x;
    printf ("*p++      => %d\n", * p ++);
    x = 5;
    p = &x;
    printf ("(*p)++    => %d\n", (* p) ++);
    x = 5;
    p = &x;
    printf ("*(p)++    => %d\n", * (p) ++);
    x = 5;
    p = &x;
    printf ("*++p      => %d\n", * ++ p);
    x = 5;
    p = &x;
    printf ("*(++p)    => %d\n", * (++ p));
    return 0;
}





int main () {
    int z = 10;
    static int x = 7;
    static int *p = &x;
    printf ("p         => %p\n", p);
    printf ("z         => %d\n", z);
    p = &z;
    printf ("p         => %p\n", p);
    printf ("*p++      => %d\n", *p++);
    x = 5;
    return 0;
}


