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

#define PARAMETER 1e3

int main(){
    double result;
    result = exp(PARAMETER);
    if (errno == ERANGE){
        printf("exp(%f) overflows\n", parameter);
        result = PARAMETER;
    }
    printf("The exponential value of %f is %f.", PARAMETER, result);
    return 0;
}


