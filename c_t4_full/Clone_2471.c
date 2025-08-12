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





#include<stdio.h>
int main () {
    int i,num,ok=1,bits=0,digit;
    unsigned powers_of_ten = 1;
    for (i=123456789;i<=987654321;i++){
        num=i;
        for(digit = 0; digit<9; digit++){
            unsigned bit = 1 << ((num / powers_of_ten) % 10);
            if ((bit == 1) || ((bits & bit) != 0)){
               ok = 0;
               break;
            }
            bits |= bit;
            powers_of_ten *= 10;
        }
        if (ok) printf("%d\n", i);
        ok=1,bits=0,powers_of_ten=1;
    }
}


