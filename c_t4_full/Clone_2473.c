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
    int bits = 0, pow10 = 1, ok = 1;
    for (int num = 123456789; num <= 987654321; ++num) {
        for (int digit = 0; digit < 9; ++digit, pow10 *= 10) {
            if ((1 << ((num / pow10) % 10)) == 1 || ((bits & (1 << ((num / pow10) % 10))) != 0)) {ok = 0;break;}
            bits |= 1 << ((num / pow10) % 10);
        }
        if (ok) printf ("%d\n", num);
        ok = 1, bits = 0, pow10 = 1;
    }
    return 0;
}


