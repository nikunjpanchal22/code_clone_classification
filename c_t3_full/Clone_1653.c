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
    double X[SIZE], Y[SIZE], intervel = 0.031415926535, sumatorio = 0.0, res; 
    int i = 0, j = 0;
	 
	for (i=0;i<SIZE;++i) {
		X[i] = intervel * i;
		Y[i] = sin(X[i]);
		if (i == 0 || i == SIZE-1)
			sumatorio += Y[i]/2;
		else 
			sumatorio += Y[i];
	}
	res = sumatorio * intervel;
	printf("Result: %f\n", res);
	return 0;
}


