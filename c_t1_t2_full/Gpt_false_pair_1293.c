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
    int p, q, r, s, t, u, v, w, x;
    for (p = 1; p < 10; p++) {
        for (q = 1; q < 10; q++) {
            if (q == p)
                continue;
            for (r = 1; r < 10; r++) {
                if (r == p || r == q)
                    continue;
                for (s = 1; s < 10; s++) {
                    if (s == p || s == q || s == r)
                        continue;
                    for (t = 1; t < 10; t++) {
                        if (t == p || t == q || t == r || t == s)
                            continue;
                        for (u = 1; u < 10; u++) {
                            if (u == p || u == q || u == r || u == s || u == t)
                                continue;
                            for (v = 1; v < 10; v++) {
                                if (v == p || v == q || v == r || v == s || v == t || v == u)
                                    continue;
                                for (w = 1; w < 10; w++) {
                                    if (w == p || w == q || w == r || w == s || w == t || w == u || w == v)
                                        continue;
                                    for (x = 1; x < 10; x++) {
                                        if (x == p || x == q || x == r || x == s || x == t || x == u || x == v || x == w)
                                            continue;
                                        unique_numbers[n++] = p * 100000000 + q * 10000000 + r * 1000000 + s * 100000 + t * 10000 + u * 1000 + v * 100 + w * 10 + x;
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
