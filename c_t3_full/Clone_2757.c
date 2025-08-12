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
#define START 123456789
#define END 987654321
#define N 9

int main() {
    for (int num = START; num <= END; ++num) {
        unsigned bits = 0;
        int ok = 1;
        int digit;
        unsigned powerOf10 = 1;
        for (digit = 0; digit < N; ++digit) {
            unsigned bit = 1 << ((num / powerOf10) % 10);
            if ((bit == 1) || ((bits & bit) != 0)) {
                ok = 0;
                break;
            }
            bits |= bit;
            powerOf10 *= 10;
        }
        if (ok) printf ("%d\n", num);
    }
    return 0;
}


