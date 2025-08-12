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
double s, x; int p;

double function(int i) {
            return s * fabs(pow((x + s * i), 2) + 4);
        }

        int main(){
            double integralSum = 0;
            for(int i = 1; i <= p; i++) {
                integralSum += function(i);
            }
            printf ("%f\n", integralSum);
            return 0;
}


