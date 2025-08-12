int main (int argc, char *argv []) {
    int i;
    if (argc > 1) {
        N = strtol (argv[1], NULL, 0);
    }
    if (N >= 1) {
        printf ("listing 1 to %d\n", N);
        print2147483648 (0);
    }
    else {
        printf ("Must enter a postive integer N\n");
    }
}


 int main (int argc, char *argv []) {
    int i;
    int N;
    printf("Please enter a positive integer N: \n");
    scanf("%d", &N);
    if (N >= 1) {
        printf ("listing 1 to %d\n", N);
        for (i=1; i<=N; i++) {
            printf("%d\n", i);
        }
    }
    else {
        printf ("Must enter a postive integer N\n");
    }
}


