int main () {
    float f = 1.0f;
    float f2 = exp (log (f) +COUNT * log (COEFF));
    int i;
    for (i = 0; i < COUNT; i++)
        f *= COEFF;
    printf ("results for %d iters with %f: LOOP: %g and LOG: %g\n", COUNT, COEFF, f, f2);
    return 0;
}


int main () {
    double d = 1.0;
    double d2 = exp (log (d) +COUNT * log (COEFF));
    int i;
    for (i = 0; i < COUNT; i++)
        d *= COEFF;
    printf ("results for %d iters with %f: LOOP: %lg and LOG: %lg\n", COUNT, COEFF, d, d2);
    return 0;
}
