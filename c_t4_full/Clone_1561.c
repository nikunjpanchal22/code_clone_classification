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

int main(void)
{
    errno = 0;
    double param = 1e3;
    double result = (errno == ERANGE) ? (printf("exp(%f) overflows\n", param), param) : exp(param);
    printf("The exponential value of %f is %f.\n", param, result);
    return 0;
}


