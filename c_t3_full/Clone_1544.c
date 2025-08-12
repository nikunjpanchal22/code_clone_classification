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
    int sum = 0;
    int i = 0;
    while (i != -1)
    {
        scanf ("%d %d", &a, &b);
        sum = a + b;
        printf ("%d: %d + %d = %d\n", ++i, a, b, sum );
    }
    return 0;
}


