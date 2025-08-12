int main (void) {
    static const char * const upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int A = 65;
    const char in [3] = "ABC";
    unsigned long long out = 0;
    size_t i;
    for (i = 0; i < sizeof in; ++i) {
        char *found = strchr (upper, in[i]);
        if (found) {
            if ((ULLONG_MAX - (A + (found - upper))) / 100 < out) {
                fprintf (stderr, "Overflow at %c\n", in [i]);
                return EXIT_FAILURE;
            }
            out = out * 100 + A + (found - upper);
        }
        else {
            fprintf (stderr, "Giving up at %c\n", in [i]);
            return EXIT_FAILURE;
        }
    }
    printf ("%llu\n", out);
    return EXIT_SUCCESS;
}


 
int main (void) {
    const char * const upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int A = 65;
    const char in [3] = "ABC";
    unsigned long long out = 0;
    size_t i;
    for (i = 0; i < sizeof in; ++i) {
        char *found = strchr (upper, in[i]);
        if (found) {
            unsigned long long result = ULLONG_MAX - (A + (int)(found - upper));
            if (result / 100 < out) {
                fprintf (stderr, "Overflow at %c\n", in [i]);
                return EXIT_FAILURE;
            }
            out = out * 100 + A + (int)(found - upper);
        }
        else {
            fprintf (stderr, "Giving up at %c\n", in [i]);
            return EXIT_FAILURE;
        }
    }
    printf ("%llu\n", out);
    return EXIT_SUCCESS;
}
