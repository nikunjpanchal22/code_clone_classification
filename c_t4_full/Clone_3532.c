int main (void) {
    test (INT_MIN);
    test (- 2);
    test (- 1);
    test (0);
    test (1);
    test (2);
    test (INT_MAX);
    return 0;
}


 

#include <stdio.h>
#include <limits.h>

void test(int num) {
            switch(num) {
                case -2147483648: printf("Min\n"); break;
                case 2147483647: printf("Max\n"); break;
                case 0: printf("Zero\n"); break;
                default: printf("Other\n"); break;
            }
        }

        int main (void) {
            test (INT_MIN);
            test (- 2);
            test (- 1);
            test (0);
            test (1);
            test (2);
            test (INT_MAX);
            return 0;
}


