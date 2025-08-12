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
    int i=1;
    double sum = 0.0;
    for (; i <= parts; i++) {
        sum += step * fabs (pow ((x + (step * i)), 2) + 4);
    }
    printf ("%f\n", sum);
    return 0;
}


