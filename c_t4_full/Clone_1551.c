int main (void) {
    double param, result;
    errno = 0;
    param = 1e3;
    result = exp (param);
    if (errno == ERANGE) {
        printf ("exp(%f) overflows\n", param);
        result = param;
    }
    printf ("The exponential value of %f is %f.\n", param, result);
    return 0;
}





#include <stdio.h>
#include <errno.h>

#define EXP(x) (exp(x))

int main (){
    double parameter = 1e3;
    double result = EXP(parameter);
    if (errno == ERANGE) printf ("exp(%f) overflows\n", parameter);
    printf("The exponential value of %f is %f.", parameter, result);
    return 0;
}


