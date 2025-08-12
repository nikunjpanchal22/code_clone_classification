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
    static int y = 2;
    static int x = 5;
    static int *p = &x;
    printf ("(int) p   => %d\n", (int) p);
    printf ("y         => %d\n", y);
    p = &y;
    printf ("(int) p   => %d\n", (int) p);
    printf ("*p++      => %d\n", *p++);
    x = 5;
    return 0;
}


