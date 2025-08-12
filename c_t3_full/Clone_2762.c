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

void printUniqueDigits(int lowerLimit, int upperLimit) {
    int itr, num;
    for(itr = lowerLimit; itr <= upperLimit; itr++) {
        num = itr;
        int isUnique = 1;
        unsigned bit = 0;
        int pow10 = 1;
        for(int i = 0; i < 9; ++i) {
            unsigned currentBit = 1 << ((num / pow10) % 10);
            if(currentBit == 1 || (bit & currentBit) != 0) {
                isUnique = 0;
                break;
            }
            bit |= currentBit;
            pow10 *= 10;
        }
        if(isUnique) {
            printf("%d\n", num);
        }
    }
    }
int main() {
    printUniqueDigits(123456789, 987654321);
    return 0;
}


