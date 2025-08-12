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
    int inputA;
    int inputB;
    while (1) {
        scanf ("%d %d", & inputA, & inputB);
        a= inputA;
        b= inputB;
        printf ("%d: %d + %d = %d\n", ++ i, a, b, sum (a, b));
    }
    return 0;
}


