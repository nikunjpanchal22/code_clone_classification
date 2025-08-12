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
#define loop_end 987654321
#define loop_start 123456789
#define total_digit 9
#define flag_set 1
#define flag_not_set 0
#define base 10

int main (){
    for(int index = loop_start; index <= loop_end; index++){
        int num = index;
        int flag = flag_set;
        unsigned bit = 0;
        unsigned power10 = 1;
        for(int i = 0; i < total_digit; ++i){
            unsigned a = 1 << ((num / power10) % base);
            if ((a == 1) || ((bit & a) != flag_not_set)){
                flag = flag_not_set;
                break;
            }
            bit |= a;
            power10 *= base;
        }
        if(flag == flag_set)
            printf("%d\n", num);
    }
    return 0;
}


