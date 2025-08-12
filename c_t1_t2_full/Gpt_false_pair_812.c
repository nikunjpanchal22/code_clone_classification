int main (void) {
    char buffer [100];
    char *endptr_n;
    char *endptr_d;
    long n;
    double d;
    fgets (buffer, 100, stdin);
    n = strtol (buffer, &endptr_n, 10);
    if (endptr_n == buffer) {
        fputs ("You didn't enter a number.", stderr);
        return EXIT_FAILURE;
    }
    d = strtod (buffer, &endptr_d);
    if (*endptr_d == '\0' || *endptr_d == '\n') {
        if (endptr_d == endptr_n) {
            puts ("You entered just a plain integer.");
        }
        else {
            puts ("You entered a floating point number - invalid.");
        }
    }
    else {
        puts ("You entered garbage after the number - invalid.");
    }
    return EXIT_SUCCESS;
}



 
int main (void) {
    char buffer [100];
    char *endptr_n;
    char *endptr_d;
    long int n;
    double d;
    fgets (buffer, 100, stdin);
    n = strtol (buffer, &endptr_n, 10);
    if (endptr_n == buffer) {
        fprintf (stderr, "No number was provided.\n");
        return EXIT_FAILURE;
    }
    d = strtod (buffer, &endptr_d);
    if (*endptr_d == '\0' || *endptr_d == '\n') {
        if (endptr_d == endptr_n) {
            printf ("You provided an integer.\n");
        }
        else {
            printf ("You provided a double - invalid.\n");
        }
    }
    else {
        printf ("You provided rubbish after the number - invalid.\n");
    }
    return EXIT_SUCCESS;
}
