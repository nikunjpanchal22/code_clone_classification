int main () {
    double integralSum = 0;
    int i;
    for (i = 1; i < (parts + 1); ++i) {
        integralSum = integralSum + (step * fabs (pow ((x + (step * i)), 2) + 4));
    }
    printf ("%f\n", integralSum);
    return 0;
}





int main () {
    long double integralSum = 0;
    size_t i;
    for (i = 1; i < (parts + 1); ++i) {
        integralSum += (step * fabsl (powl ((x + (step * i)), 2) + 4));
    }
    printf ("%Lf\n", integralSum);
    return 0;
}


