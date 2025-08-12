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
    const int SIZE = 100;
    double vX[SIZE], Y [SIZE], step = 3.141592653589793/100.0, sum = 0, aResult;

    int i, j;
     
    for (i=0;i<SIZE;++i) {
        vX[i] = step*(i+1);
        Y[i] = sin(vX[i]);
        if (i == 0 || i == SIZE-1)
            sum += Y[i]/2;
        else 
            sum += Y[i];
    }
    aResult = sum * step;
    printf("Trapezoidal Result: %f\n", aResult);
    return 0;
}


