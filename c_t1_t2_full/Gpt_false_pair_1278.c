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


 
int main (void) {
    int indx;
    int num;
    for (indx = 123456789; indx <= 987654321; indx++) {
        num = indx;
        int ok = 1;
        unsigned bits = 0;
        int digit;
        int powers10[9] = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};
        for (digit = 0; digit < 9; ++digit) {
            unsigned bit = 1 << ((num / powers10[digit]) % 10);
            if ((bit == 1) || ((bits & bit) != 0)) {
                ok = 0;
                break;
            }
            bits |= bit;
        }
        if (ok) {
            printf ("%d\n", num);
        }
    }
    return 0;
}
