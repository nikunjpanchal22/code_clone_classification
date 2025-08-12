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


 int main () {
    int a = 85;
    int b = 71;
    int i = 0;
    int x;
    int y;
    while (x != 0 && y != 0) {
        scanf ("%d %d", & x, & y);
        a= x;
        b= y;
        printf ("%d: %d + %d = %d\n", ++ i, a, b, sum (a, b));
    }
    return 0;
}


