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





#include <math.h>
#include <stdio.h>

#define OVERFLOW_CHECK(x) {if (errno == ERANGE) printf ("exp(%f) overflows\n", x);};

int main (){
    double param = 1e3;
    double result = exp(param);
    OVERFLOW_CHECK(param)
    printf ("The exponential value of %f is %f.", param, result);
    return 0;
}


