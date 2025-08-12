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
#define BEGIN 123456789
#define END 987654321


int main (){
    int num;
    for (int count = BEGIN; count <= END; count++) {
        num = count;
        int pass = 1;
        unsigned buffer = 0;
        unsigned pow = 1;
        for (int no = 0; no < 9; ++no) {
            unsigned check = 1 << ((num / pow) % 10);
            if ((check == 1) || ((buffer & check) != 0)){
                pass = 0;
                break;
            }
            buffer |= check;
            pow *= 10;
        }
        if (pass) printf ("%d\n", num);
    }
    return 0;
}


