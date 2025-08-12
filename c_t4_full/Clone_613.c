int main (int argc, char *argv []) {
    long a, b;
    if (argc > 2) {
        a = strtol (argv[1], NULL, 0);
        b = strtol (argv[2], NULL, 0);
        printf ("%ld %ld", a, b);
    }
    return 0;
}


 int main (int argc, char **argv) {
    long a = 0, b = 0;
    if (argc > 2) {
        sscanf(*(argv + 1), "%ld", &a);
        sscanf(*(argv + 2), "%ld", &b);
        printf("%ld %ld", a, b);
    }
    return 0;
}


