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
    double X [SIZE], Y [SIZE], incr = PI, h = PI / 100.0, sum = 0.0, trapz;
    int i = SIZE - 1;
    for(i; i >= 0; --i){
        X[i] = incr;
        incr -= h;
    }
    for(int k = 0; k < SIZE; ++k){
        Y[k] = sin (X[k]);
    }
    for(int j = 0; j < SIZE; ++j){
        if (j == 0 || j == SIZE - 1)
            sum += Y[j] / 2;
        else
            sum += Y[j];
    }
    trapz = sum * h;
    printf ("Result: %f \n", trapz);
    return 0;
}


