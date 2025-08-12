int main (int argc, char *argv []) {
    long a, b;
    if (argc > 2) {
        a = strtol (argv[1], NULL, 0);
        b = strtol (argv[2], NULL, 0);
        printf ("%ld %ld", a, b);
    }
    return 0;
}


 int main (int argc, char *argv []) {
    long a, b;
    if (argc > 2) {
        a = (long)strtof(argv[1], NULL);
        b = (long)strtof(argv[2], NULL);
        printf("%ld %ld", a, b);
    }
    return 0;
}


