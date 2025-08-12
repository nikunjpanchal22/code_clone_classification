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
    for (int i = 123456789, num, ok, digit; i<= 987654321; ++i) {
        num = i;
        ok = 1;
        unsigned bits = 0;
        unsigned tenToThe = 1;
        for (digit = 0; digit < 9; ++digit) {
            unsigned b = 1 << ((num / tenToThe) % 10);
            if (b == 1 || (bits & b)) {
                ok = 0;
                break;
            }
            bits |= b;
            tenToThe *= 10;
        }
        if (ok) {
            printf ("%d\n", num);
        }
    }
    return 0;
}


