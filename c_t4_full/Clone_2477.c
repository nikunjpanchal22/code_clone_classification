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
#define RANGE_MIN 123456789
#define RANGE_MAX 987654321

int main () {
    for (int i = RANGE_MIN; i <= RANGE_MAX; i++) {
        int n = i;
        int status = 1;
        unsigned int bit_pattern = 0;
        unsigned int tens = 1;
        for (int d = 0; d < 9; d++) {
            unsigned b = 1 << ((n / tens) % 10);
            if (b == 1 || (bit_pattern & b) != 0) {
                status = 0;
                break;
            }
            bit_pattern |= b;
            tens *= 10;
        }
        if (status) printf("%d\n", n);
    }
    return 0;
}


