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
    int num;
    for (int x = 123456789; x<= 987654321; ++x) {
        num = x;
        int is_ok = 1;
        unsigned bits = 0;
        unsigned powerTen = 1;
        for (int d = 0; d < 9; ++d) {
            unsigned current_bit = 1 << ((num / powerTen) % 10);
            if ((current_bit == 1) || ((bits & current_bit) != 0)) {
                is_ok= 0;
                break;
            }
            bits |= current_bit;
            powerTen *= 10;
        }
        if (is_ok) printf ("%d\n", num);
    }
    return 0;
}


