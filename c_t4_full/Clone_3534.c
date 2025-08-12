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
            int i;
            printf("Factors are: ");
            for(i=1; i <= num; ++i) {
                if (num%i == 0) printf("%d ", i);
            }
            printf("\n");
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


