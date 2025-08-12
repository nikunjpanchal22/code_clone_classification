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

#define Phi 1,61803398874989485
#define phi (-0,61803398874989485)

int Fibonacci (int n) {
    return round ((pow (Phi, n) - pow (phi, n)) / sqrt (5));
}


