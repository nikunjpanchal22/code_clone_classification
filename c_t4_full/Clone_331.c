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
    char input[64];
    printf("Please enter a positive integer N: \n");
    fgets(input, 64, stdin);
    N = atoi (input);
    if (N >= 1) {
        printf ("listing 1 to %d\n", N);
        while ( i <= N) 
        {
            printf("%d\n", i);
            i+=4;
        }
    }
    else {
        printf ("Must enter a postive integer N\n");
    }
}


