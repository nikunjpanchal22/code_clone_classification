int main () {
    double X [SIZE], Y [SIZE], incr = 0.0, h = PI / 100.0, sum = 0.0, trapz;
    int i = 0, k = 0, j = 0;
    for (i; i < SIZE; ++i) {
        X[i] = incr;
        incr += h;
    }
    for (k; k < SIZE; ++k) {
        Y[k] = sin (X[k]);
    }
    for (j; j < SIZE; ++j) {
        if (j == 0 || j == SIZE - 1)
            sum += Y[j] / 2;
        else
            sum += Y[j];
    }
    trapz = sum * h;
    printf ("Result: %f \n", trapz);
    return 0;
}


int main () {
    double X [SIZE], Y [SIZE], start = 0.0, change = PI / 100.0, accumulate = 0.0, result;
    int loop1 = 0, loop2 = 0, loop3 = 0;
    for (loop1; loop1 < SIZE; ++loop1) {
        X[loop1] = start;
        start += change;
    }
    for (loop2; loop2 < SIZE; ++loop2) {
        Y[loop2] = sin (X[loop2]);
    }
    for (loop3; loop3 < SIZE; ++loop3) {
        if (loop3 == 0 || loop3 == SIZE - 1)
            accumulate += Y[loop3] / 2;
        else
            accumulate += Y[loop3];
    }
    result = accumulate * change;
    printf ("Result: %f \n", result);
    return 0;
}
