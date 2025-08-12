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





#define not_set 0
#define digit 9
#include <stdio.h>
int main(){
    unsigned bit;
    int num,flg,indx;
    unsigned b=0;
    unsigned p=1;
    for(indx=123456789;indx<=987654321;indx++){
        num=indx;
        flg=1;
        for(int j=0; j<digit;++j){
            bit=1<<((num/p)%10);
            if ((bit==1) || ((b&bit)!=not_set)){
                flg=not_set;
                break;
            }
            b|=bit;
            p*=10;
        }
        if(flg)
            printf("%d\n",num);
    }
    return 0;
}


