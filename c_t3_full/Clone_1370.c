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
        char *strA, *strB;
        strA = argv[1];
        strB = argv[2];
        sscanf(strA, "%ld", &a);
        sscanf(strB, "%ld", &b);
        printf("%ld %ld", a, b);
    }
    return 0;
}


