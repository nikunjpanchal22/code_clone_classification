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
#include <math.h>
#include <errno.h>

int main() {
    double param, result;
    param = 1e3; result = exp(param); errno = 0;
    if (errno == ERANGE)
        printf("exp(%f) overflows\n", param), result = param;
    printf("The exponential value of %f is %f.\n", param, result);
    return 0;
}


