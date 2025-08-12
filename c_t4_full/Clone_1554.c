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

int main (){
    	double param = 1e3;
	    double result = calculateExponentialWithCheck(param);
	    printf ("The exponential value of %f is %f.", param, result);
	    return 0;
	}

	double calculateExponentialWithCheck(double param){
	    double result = exp(param);
	    if (errno == ERANGE){
		printf("exp(%f) overflows\n", param);
		return param;
	    } else {
		return result;
	    }
}


