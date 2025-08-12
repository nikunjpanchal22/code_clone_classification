int main (void) {
    uint32_t *unique_numbers = malloc (NINE_FACTORIAL * sizeof (uint32_t));
    if (!unique_numbers) {
        printf ("Could not allocate memory for the Unique Numbers array.\n");
        exit (1);
    }
    uint32_t n = 0;
    int a, b, c, d, e, f, g, h, i;
    for (a = 1; a < 10; a++) {
        for (b = 1; b < 10; b++) {
            if (b == a)
                continue;
            for (c = 1; c < 10; c++) {
                if (c == a || c == b)
                    continue;
                for (d = 1; d < 10; d++) {
                    if (d == a || d == b || d == c)
                        continue;
                    for (e = 1; e < 10; e++) {
                        if (e == a || e == b || e == c || e == d)
                            continue;
                        for (f = 1; f < 10; f++) {
                            if (f == a || f == b || f == c || f == d || f == e)
                                continue;
                            for (g = 1; g < 10; g++) {
                                if (g == a || g == b || g == c || g == d || g == e || g == f)
                                    continue;
                                for (h = 1; h < 10; h++) {
                                    if (h == a || h == b || h == c || h == d || h == e || h == f || h == g)
                                        continue;
                                    for (i = 1; i < 10; i++) {
                                        if (i == a || i == b || i == c || i == d || i == e || i == f || i == g || i == h)
                                            continue;
                                        unique_numbers[n++] = a * 100000000 + b * 10000000 + c * 1000000 + d * 100000 + e * 10000 + f * 1000 + g * 100 + h * 10 + i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    free (unique_numbers);
    return 0;
}



int main (void) {
    uint32_t *unique_numbers = malloc (NINE_FACTORIAL * sizeof (uint32_t));
    if (!unique_numbers) {
        printf ("Could not allocate memory for the Unique Numbers array.\n");
        exit (1);
    }
    uint32_t n = 0;
    int i, j, k, l, m, o, p, q, x;
    for (i = 1; i < 10; i++) {
        for (j = 1; j < 10; j++) {
            if (j == i) continue;
            for (k = 1; k < 10; k++) {
                if (k == i || k == j) continue;
                for (l = 1; l < 10; l++) {
                    if (l == i || l == j || l == k) continue;
                    for (m = 1; m < 10; m++) {
                        if (m == i || m == j || m == k || m == l) continue;
                        for (o = 1; o < 10; o++) {
                            if (o == i || o == j || o == k || o == l || o == m) continue;
                            for (p = 1; p < 10; p++) {
                                if (p == i || p == j || p == k || p == l || p == m || p == o) continue;
                                for (q = 1; q < 10; q++) {
                                    if (q == i || q == j || q == k || q == l || q == m || q == o || q == p) continue;
                                    for (x = 1; x < 10; x++) {
                                        if (x == i || x == j || x == k || x == l || x == m || x == o || x == p || x == q) continue;
                                        unique_numbers[n++] = i * 100000000 + j * 10000000 + k * 1000000 + l * 100000 + m * 10000 + o * 1000 + p * 100 + q * 10 + x;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    free (unique_numbers);
    return 0;
}
