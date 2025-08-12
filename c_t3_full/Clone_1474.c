int main (int argc, char *argv []) {
    int a [N] = {0};
    while (next (a +N - 1, N) != 10) {
        for (int i = 0; i < N; i++) {
            if (a[i] != 0)
                printf ("%d", a[i]);
        }
        printf ("\n");
    }
    return 0;
}


 int main(int argc, char *argv[]) 
{
    int a[N] = {0};
    int i, l = 0;

    for (int j = 0; j < 10; j++) 
    {
        for (int k = 0; k < N; k++) 
        {
            a[k] = l;
            printf("%d", a[k]);
        }
        l++;
        printf("\n");
    }
    return 0;
}


