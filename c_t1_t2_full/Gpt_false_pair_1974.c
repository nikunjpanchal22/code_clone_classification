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
    int SIZE = 100;
    double X[SIZE], Y[SIZE], h = 3.14/100.0, tz = 0.0, tapzoid;
    int i = 0, j = 0, k = 0;

    for (i; i < SIZE; ++i) {
        X[i] = h*i;
        Y[i] = sin(X[i]);
    }

    for (k; k < SIZE; ++k) {
        if (k == 0 || k == SIZE - 1)
            tz += Y[k]/2;
        else
            tz += Y[k];
    }
    tapzoid = tz * h;
    printf ("Result: %f \n", tapzoid);
    return 0;
}
