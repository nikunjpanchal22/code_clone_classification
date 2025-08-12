int main () {
    int i = 1, fibonacci = 1;
    do {
        printf ("The %2dst Fibonacci number is %3d\n", i, fibonacci);
        fibonacci = Fibonacci (++i);
    }
    while (fibonacci <= 100);
    return 0;
}




#include <math.h>
int Fibonacci(int n){
    double phi = (1 + sqrt(5)) / 2;
    return round(pow(phi, n) / sqrt(5));
 }


