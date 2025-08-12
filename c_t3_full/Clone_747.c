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
    int N = 0;
    if (argc > 1) {
        N = atoi (argv[1]);
    }
    if (N >= 1) {
        printf ("listing 1 to %d\n", N);
        for (i=0; i<N; i++) {
            printf("%d\n", i);
        }
    }
    else {
        printf ("Must enter a postive integer N\n");
    }
}


