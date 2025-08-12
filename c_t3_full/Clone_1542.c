int main () {
    int a = 85;
    int b = 71;
    int i = 0;
    while (1) {
        scanf ("%d %d", & a, & b);
        printf ("%d: %d + %d = %d\n", ++ i, a, b, sum (a, b));
    }
    return 0;
}


 int main()
{
    int a = 85;
    int b = 71;
    int c;
    int i = 0;
    for (i = 0; i < 10; ++i)
    {
        scanf("%d %d", &a, &b);
        c = a+b;
        printf("%d: %d + %d = %d\n", i, a, b, c);
    }
     return 0;
}


