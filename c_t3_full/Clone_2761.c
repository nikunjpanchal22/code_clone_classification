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
int main(){
    int index, num;
    for(index=123456789; index <= 987654321; index++) {
        num = index;
        int check = 1;
        unsigned bits = 0;
        unsigned power_10 = 1;
        for(int dig = 0; dig < 9; ++dig) {
            unsigned bit = 1 << ((num / power_10) % 10);
            if ((bit == 1) || ((bits & bit) != 0)){
                check = 0;
                break;
            }
            bits |= bit;
            power_10 *= 10;
        }
        if(check)
            printf("%d\n", num);
    }
    return 0;
}


