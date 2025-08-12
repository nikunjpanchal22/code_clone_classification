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
                uint32_t u32;
                float fl;
            } uf;
            uf.u32 = (uint32_t)strtol (s, NULL, 2);
            return uf.fl;
        }
        double Ieee754SingleDigits2DoubleNoCheat (const char *s) {
            int i, exponent = 0;
            double fraction = 0.0;
            for (i = 1; i <= 8; i++)
                exponent = (exponent << 1) + (s[i] == '1' ? 1 : 0);
            for (i = 9; i <= 31; i++)
                fraction += (s[i] == '1' ? 1.0 : 0.0) / pow (2, i - 8);
            return pow (-1, s[0] == '1' ? 1 : 0) * pow (2, exponent - 127) * (1.0 + fraction);
}


