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





void fillX(double X[], double h, int i, double incr){
            if(i==SIZE)
                return;
            X[i] = incr;
            fillX(X, h, i+1, incr+h);
        }

        void fillY(double X[], double Y[], int i){
            if(i==SIZE)
                return;
            Y[i] = sin(X[i]);
            fillY(X, Y, i+1);
        }

        double calculateSum(double Y[], int i, double sum){
            if(i==SIZE)
                return sum;
            if (i == 0 || i == SIZE - 1)
                sum += Y[i] / 2;
            else
                sum += Y[i];
            return calculateSum(Y, i+1, sum);
        }

        int main () {
            double X [SIZE], Y [SIZE], h = PI / 100.0, trapz;
            fillX(X, h, 0, 0.0);
            fillY(X, Y, 0);
            double sum = calculateSum(Y, 0, 0.0);
            trapz = sum * h;
            printf ("Result: %f \n", trapz);
            return 0;
}


