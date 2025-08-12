int main (void) {
    printf ("%+g\n", Ieee754SingleDigits2DoubleCheat ("110000101100010010000000000000000"));
    printf ("%+g\n", Ieee754SingleDigits2DoubleNoCheat ("010000101100010010000000000000000"));
    printf ("%+g\n", Ieee754SingleDigits2DoubleCheat ("000000000100000000000000000000000"));
    printf ("%+g\n", Ieee754SingleDigits2DoubleNoCheat ("100000000100000000000000000000000"));
    printf ("%+g\n", Ieee754SingleDigits2DoubleCheat ("000000000000000000000000000000000"));
    printf ("%+g\n", Ieee754SingleDigits2DoubleNoCheat ("000000000000000000000000000000000"));
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#include <math.h>
double Ieee754SingleDigits2DoubleCheat (const char *s) {
            long l = strtol (s, NULL, 2);
            return *(double*) &l;
        }
        double Ieee754SingleDigits2DoubleNoCheat (const char *s) {
            int sign = s[0] - '0';
            int exponent = (int)strtol (s + 1, NULL, 2) - 127;
            long fraction = strtol (s + 9, NULL, 2);
            return ldexp (sign ? -fraction : fraction, exponent);
}


