int main (void) {
    int a [N], i = 0, x = 0;
    printf ("Enter %d Numbers: ", N);
    for (i = 0; i < N; i++)
        scanf ("%d", a +i);
    x = sum_array (a, N);
    printf ("the sum  is %d\n", x);
    return 0;
}


 int main(void)
{
    int a[N], i, x=0;
    printf("Enter %d numbers: ", N);
    for (i=0; i<N; i++)
    {
        scanf("%d", a+i);
    }
    x = sum_array(a, N);
    printf("the sum is %d\n", x);
    return 0;
}
