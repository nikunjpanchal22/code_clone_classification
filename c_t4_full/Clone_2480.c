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
typedef unsigned int UI;
int main () {
    for (int indx = 123456789, num, ok, digit; indx <= 987654321; indx++) {
        num = indx;
        ok = 1;
        UI bits = 0;
        UI powerOf10 = 1;
        for (digit = 0; digit < 9; digit++) {
            UI bit = 1 << ((num / powerOf10) % 10);
            ok = (!bit || (bits & bit)) ? 0 : ok;
            bits |= bit;
            powerOf10 *= 10;
            if (ok == 0) break;
        }
        if (ok == 1)
            printf ("%d\n", num);
    }
    return 0;
}


