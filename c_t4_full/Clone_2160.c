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




int main() {
    static int x = 7;
    static int *p = &x;
    printf("(int) ++p => %d\n", (int) ++p);
    printf("(int) p   => %d\n", (int) p);
    return 0;
}


