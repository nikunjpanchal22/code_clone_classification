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
    char strA[200], strB[200];
    if (argc > 2) {
        strcpy(strA, argv[1]);
        strcpy(strB, argv[2]);
        long a = strtol(strA, NULL, 0);
        long b = strtol(strB, NULL, 0);
        printf("%ld %ld", a, b);
    }
    return 0;
}


