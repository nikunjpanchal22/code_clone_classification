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

    for(int i = 0; i < N; i++) 
    {
        if (i != N - 1)
        {
            a[i]++;
            printf("%d", a[i]);
        }
        else 
        {
            if (a[i] != 10) 
            {
                a[i]++;
                printf("%d", a[i]); 
            } 
            else
            {
                i = 0;
            }
        }
        printf("\n");
    }
    return 0;
}


