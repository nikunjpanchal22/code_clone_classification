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
void digitCheckAndPrint (int start, int end) {
    for (int ind = start; ind <= end; ind++) {
        int num = ind;
        int is_valid = 1;
        unsigned ref_bit = 0;
        unsigned p10 = 1;
        for (int dgt = 0; dgt < 9; ++dgt) {
            unsigned bit = 1 << ((num / p10) % 10);
            if ((bit == 1) || ((ref_bit & bit) != 0)){
                is_valid = 0;
                break;
            }
            ref_bit |= bit;
            p10 *= 10;
        }
        if (is_valid) printf ("%d\n", num);
    }
    }
int main (){
    digitCheckAndPrint(123456789,987654321);
    return 0;
}


