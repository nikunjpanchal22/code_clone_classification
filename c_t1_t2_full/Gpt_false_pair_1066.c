int main (void) {
    int i, j;
    x[0] = -1;
    unsigned mask = -1;
    for (i = 0;;) {
        for (j = x[i] + 1; j < N; j++) {
            if ((mask >> j) & 1) {
                x[i] = j;
                mask ^= (1 << x[i]);
                if (++i >= N) {
                    for (j = 0; j < N; j++)
                        printf ("%3i", x[j]);
                    printf ("\n");
                }
                else
                    x[i] = -1;
                break;
            }
        }
        if ((j >= N) || (i >= N)) {
            if (--i < 0)
                break;
            mask ^= (1 << x[i]);
        }
    }
}


  int main (void) {
    int i, j;
    x[0] = -1;
    unsigned mask = ~(unsigned)0;
    for (i = 0; ; ) {
        for (j = x[i] + 1; j < N; j++) {
            if ((mask >> j) & (unsigned)1) {
                x[i] = j;
                mask ^= (1U << x[i]);
                if (++i >= N) {
                    for (j = 0; j < N; j++)
                        printf ("%3i", x[j]);
                    printf ("\n");
                }
                else
                    x[i] = -1;
                break;
            }
        }
        if ((j >= N) || (i >= N)) {
            if (--i < 0)
                break;
            mask ^= (1U << x[i]);
        }
    }
}
