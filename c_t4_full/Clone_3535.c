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


 

#include <stdlib.h>
#define INT_MIN -2147483648
#define INT_MAX 2147483647

void test(int num){
        int* p = (int*)malloc(num * sizeof(int));
        free(p);
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


