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
double calculate(double step, double x, int i) {
            return step * fabs(pow((x + (step * i)), 2) + 4);
        }

        int main (){
            double integralSum = 0.0;
            for(int i = 1; i <= parts; i++) {
                integralSum += calculate(step, x, i);
            }
            printf ("%f\n", integralSum);
            return 0;
}


