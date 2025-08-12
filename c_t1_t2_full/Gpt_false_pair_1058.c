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
    uint32_t r, s;
    fact (NPER, f);
    for (r = 0; r < f[NPER]; r += 3) {
        perm (r, NPER, f, p);
        for (s = 0; s < NPER; s++)
            printf ("%s, ", DukeQuote[p[s]]);
        printf ("\n");
    }
    return 0;
}
