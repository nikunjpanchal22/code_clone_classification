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


 int main() {
    int a = 85;
    int b = 71;
    int c;
    int i = 0;
    while (i < 10) 
    {
        scanf("%d %d", &a, &b);
        c = a + b;
        printf("%d: %d + %d = %d\n", i + 1, a, b, c);
        i++;
    }
    return 0;
}


