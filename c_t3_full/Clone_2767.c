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
    unsigned bits, power10;
    int indx, num, ok, digit;
    for (indx = 123456789; indx <= 987654321; ++indx) {
        num = indx;
        ok = 1;
        bits = 0;
        power10 = 1;
        for (digit = 0; digit < 9; digit++) {
            unsigned bit = 1 << ((num / power10) % 10);
            if ((bit == 1) || ((bits & bit) != 0)) {
               ok = 0;
               break;
            }
            bits|= bit;
            power10 *= 10;
        }
        if (ok) {
            printf("%d\n", num);
        }
    }
    return 0;
}


