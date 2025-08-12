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
    int i = 0; 
    int d, e;
    while (1) 
    {
        scanf ("%d %d", & d, & e);
        if (d != 0 && e != 0)
        {
            a = d;
            b = e;
            printf ("%d: %d + %d = %d\n", i + 1, a, b, sum (a, b));
            i++;
        }
    }
    return 0;
}


