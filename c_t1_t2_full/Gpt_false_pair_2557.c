int main (void) {
    uint32_t f [NPER + 1];
    uint32_t p [NPER];
    uint32_t r, s;
    fact (NPER, f);
    for (r = 0; r < f[NPER]; r++) {
        perm (r, NPER, f, p);
        for (s = 0; s < NPER; s++)
            printf ("%s, ", DukeQuote[p[s]]);
        printf ("\n");
    }
    return 0;
}


int main (void) {
    uint32_t f [NPER + 1];
    uint32_t p [NPER];
    uint32_t r, s, k;
    fact (NPER, f);
    for (k = 0; k < f[NPER]; k++) {
        perm (k, NPER, f, p);
        for (r = 0; r < NPER; r++)
            printf ("%s, ", DukeQuote[p[r]]);
        printf ("\n");
    }
    return 0;
}
