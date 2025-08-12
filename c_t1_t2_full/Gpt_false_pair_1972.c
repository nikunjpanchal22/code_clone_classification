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
    double X[SIZE], Y[SIZE], h = PI/100, total = 0.0, trapz;
    int i = 0, loop = 0, j = 0;
    for (i; i < SIZE; ++i) {
        X[i] = h*i; 
        Y[i] = sin(X[i]);
    }
    for (loop; loop < SIZE; ++loop) {
        if (loop == 0 || loop == SIZE - 1)
            total += Y[loop] / 2;
        else
            total += Y[loop];
    }
    trapz = total * h;
    printf ("Result: %f \n", trapz);
    return 0;
}
