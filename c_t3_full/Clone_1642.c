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
    static const char * upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    unsigned int A = 65;
    char in [3] = "ABC";
    unsigned long long out = 0;
    for (size_t i = 0; i < sizeof (in); i++) {
        char *place = strchr (upper, in [i]);
        if (place) {
            if ((ULLONG_MAX - (A + (place - upper))) / 100 < out) {
                fprintf (stderr, "Overflow at %c \n", in[i]);
                return EXIT_FAILURE;
            }
            out = out * 100 + A + (place - upper);
        }
        else {
            fprintf (stderr, "Giving up at %c \n", in[i]);
            return EXIT_FAILURE;
        }
    }
    printf ( "%llu \n", out );
    return EXIT_SUCCESS;
}


