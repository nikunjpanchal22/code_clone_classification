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
    for (int i = 123456789; i <= 987654321; i++) {
        int n = i;
        int flag = 1;
        unsigned int bits = 0;
        unsigned int powers10 = 1;
        for (int j = 0; j < 9; j++) {
            unsigned bit = 1 << ((n / powers10) % 10);
            if ((bit == 1) || ((bits & bit) != 0)) {
                flag = 0;
                break;
            }
            bits |= bit;
            powers10 *= 10;
        }
        if (flag) {
            printf ("%d\n", n);
        }
    }
    return 0;
}


