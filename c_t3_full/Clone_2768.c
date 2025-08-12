int main (void) {
    int indx;
    int num;
    for (indx = 123456789; indx <= 987654321; indx++) {
        num = indx;
        int ok = 1;
        unsigned bits = 0;
        int digit;
        unsigned powers10 = 1;
        for (digit = 0; digit < 9; ++digit) {
            unsigned bit = 1 << ((num / powers10) % 10);
            if ((bit == 1) || ((bits & bit) != 0)) {
                ok = 0;
                break;
            }
            bits |= bit;
            powers10 *= 10;
        }
        if (ok) {
            printf ("%d\n", num);
        }
    }
    return 0;
}





#include <stdio.h>
int main () {
    int n, ok, digit;
    for (int indx = 123456789; indx<= 987654321; indx++) {
        n = indx;
        ok = 1;
        unsigned bit_Values = 0;
        unsigned power10 = 1;
        for (digit = 0; digit < 9; ++digit) {
            unsigned bit = 1 << ((n / power10) % 10);
            if (bit == 1 || (bit_Values & bit)) {
                ok = 0;
                break;
            }
            bit_Values |= bit;
            power10 *= 10;
        }
        if (ok) printf ("%d\n", n);
    }
    return 0;
}


