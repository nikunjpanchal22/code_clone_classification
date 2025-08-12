int main () {
    double integralSum = 0;
    int i;
    for (i = 1; i < (parts + 1); ++i) {
        integralSum = integralSum + (step * fabs (pow ((x + (step * i)), 2) + 4));
    }
    printf ("%f\n", integralSum);
    return 0;
}





int main (){
    double integralSumOfX = 0;
    for (int i = 1; i <= parts; ++i) {
        integralSumOfX += (step * fabs ((x + (step * i)) * (x + (step * i)) + 4));
    }
    printf ("%f\n", integralSumOfX);
    return 0;
}


