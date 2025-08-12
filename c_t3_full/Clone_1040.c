int main () {
    int a [10], i, prime = 0, c = 0;
    printf ("Enter 10 numbers:\n");
    for (i = 0; i < 10; i++) {
        scanf (" %d", & a [i]);
    }
    printf ("Prime numbers are:");
    for (i = 0; i < 10; i++) {
        if (a[i] < 2)
            continue;
        prime = 1;
        for (c = 2; c * c <= a[i]; c++) {
            if (a[i] % c == 0) {
                prime = 0;
                break;
            }
        }
        if (prime == 1)
            printf ("%d, ", a[i]);
    }
}


 int main()
{
    int a[10], i, prime = 0, c = 0;
    printf("Enter 10 numbers: \n");
    for(i = 0; i < 10; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("Prime numbers are: ");
    for(i = 0; i < 10; i++)
    {
        if(a[i] == 2)
            {
            printf("%d, ", a[i]);
            continue;
            }
        prime = 1;
        for(c = 2; c < a[i]/2; c++)
            {
            if(a[i] % c == 0)
                {
                prime = 0;
                break;
                }
            }
        if(prime == 1)
            {
            printf("%d, ", a[i]);
            }
    }

return 0;
}


