int main (int argc, char *argv []) {
    unsigned long long n1, n2;
    if (argc > 1) {
        n1 = strtoull (argv[1], NULL, 0);
    }
    else {
        printf ("Enter the lower limit: ");
        scanf ("%llu", & n1);
    }
    if (argc > 2) {
        n2 = strtoull (argv[2], NULL, 0);
    }
    else {
        printf ("Enter the upper limit: ");
        scanf ("%llu", & n2);
    }
    for (unsigned long long n = n1; n <= n2; n++) {
        n = next_narcissistic (n, n2 +1);
        if (n == 0)
            break;
        printf ("%llu\n", n);
    }
    return 0;
}


 int main (int argc, char *argv []) {
    unsigned long long n1, n2;
    if (argc > 1) {
        n1 = (unsigned long long)strtod (argv[1], NULL);
        n2 = (unsigned long long)strtod (argv[2], NULL);
    }
    else {
        printf ("Enter the lower and upper limits: ");
        scanf ("%llu %llu", &n1, &n2);
    }
    for (unsigned long long n = n1; n <= n2; n++) {
        if (next_narcissistic (n, n2 +1) > 0) {
            printf ("%llu\n", n);
        }
        n++;
    }
    return 0;
}


