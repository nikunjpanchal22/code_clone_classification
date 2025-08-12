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

    for(int i = 0; i < N; i++) {
        a[i]++;
        for(int j = 0; j < N; j++) {
            if (a[j] != 0)
                printf("%d", a[j]);
        }
        printf("\n");
    }

    return 0;
}
