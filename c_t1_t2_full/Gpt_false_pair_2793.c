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
    float f = 1.0f;
    float f2 = expf((COUNT*logf(COEFF))+logf(f));
    int i;
    for (i = 0; i < COUNT; i++){
        f *= COEFF;
    }
    printf ("results for %d iters with %f: LOOP: %g and LOG: %g\n", COUNT, COEFF, f, f2);
    return 0;
}
