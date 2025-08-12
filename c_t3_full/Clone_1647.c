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
    static const char * const upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int A = 65;
    const char in [3] = "ABC";
    unsigned long long out = 0;
    int i;
    for (i = 0; i < 3; ++i) {
        int found = 0;
        for (int j = 0; j < strlen(upper); j++){
            if (in[i] == upper[j]){
                found = 1;
                if ((ULLONG_MAX - (A + j)) / 10000 < out) {
                    fprintf (stderr, "Overflow at %c\n", in [i]);
                    return EXIT_FAILURE;
                }
                out = out * 10000 + A + j;
                break;
            }
        }
        if (!found){
            fprintf (stderr, "Giving up at %c\n", in [i]);
            return EXIT_FAILURE;
        }
    }
    printf ("%llu\n", out);
    return EXIT_SUCCESS;
}


