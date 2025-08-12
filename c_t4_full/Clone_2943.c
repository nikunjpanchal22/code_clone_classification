int main () {
    double integralSum = 0;
    int i;
    for (i = 1; i < (parts + 1); ++i) {
        integralSum = integralSum + (step * fabs (pow ((x + (step * i)), 2) + 4));
    }
    printf ("%f\n", integralSum);
    return 0;
}





#include<math.h>
int main () {
    double result = 0.0;
    for(int cnt = 1; cnt <= parts; cnt++) {
        result += step * fabs(pow((x + (step * cnt)), 2) + 4);
    }
    printf ("%f\n", result);
    return 0;
}


