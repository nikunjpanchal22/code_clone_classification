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
double calculateIntegral(double s, double X, int i) {
            return s * fabs(pow((X + (s * i)), 2) + 4);
        }

        int main (){
            double integr = 0;
            for (int i=1; i <= parts; i++) {
                integr += calculateIntegral(step, x, i);
            }
            printf ("%f\n", integr);
            return 0;
}


