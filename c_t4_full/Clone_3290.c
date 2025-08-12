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
            union {
                long as_long;
                double as_double;
            } u;
            u.as_long = strtol (s, NULL, 2);
            return u.as_double;
        }
        double Ieee754SingleDigits2DoubleNoCheat (const char *s) {
            int sign = s[0] == '1' ? -1 : 1;
            int exponent = (int)strtol (s + 1, NULL, 2) - 127;
            double fraction = strtol (s + 9, NULL, 2) / (double)(1 << 23);
            return sign * (1 + fraction) * pow (2, exponent);
}


