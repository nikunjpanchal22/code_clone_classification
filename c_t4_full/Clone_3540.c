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

void test(int num){
            printf("The number is: %d\n", num);
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


