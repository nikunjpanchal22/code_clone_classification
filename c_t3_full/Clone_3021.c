int main () {
    double integralSum = 0;
    int i;
    for (i = 1; i < (parts + 1); ++i) {
        integralSum = integralSum + (step * fabs (pow ((x + (step * i)), 2) + 4));
    }
    printf ("%f\n", integralSum);
    return 0;
}





#define CALC_INTEGRAL(part, val) (step * fabs (pow ((x + (step * part)), 2) + 4))

int main () {
    double sum = 0;
    for (int i = 1; i < (parts + 1); ++i) {
        sum += CALC_INTEGRAL(i, x);
    }
    printf ("%f\n", sum);
    return 0;
}


