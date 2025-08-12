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
    double sum = 0;
    int j;
    for (j = 1; j < (parts + 1); j++) {
        sum += (step * fabs ((x + (step * j)) * (x + (step * j)) + 4));
    }
    printf ("%f\n", sum);
    return 0;
}


