int main (void) {
    int numbers [] = {1, 1, 2, 2, 2, 3, 4, 5, 6, 6, 7, 7, 7, 8, 9};
    for (size_t i = 0; i < SIZEOF_ARRAY (numbers) - 1; ++i) {
        if (contains (numbers, i, numbers[i]))
            continue;
        if (contains (numbers +i + 1, SIZEOF_ARRAY (numbers) -i, numbers[i]))
            printf ("Number %d has duplicate values\n", numbers[i]);
    }
}






#include<stdio.h>
#include<stdlib.h>
#define SIZEOF_ARRAY(x) (sizeof(x)/sizeof(*x))

int contains(int* arr, int len, int num) {
            for (int i = 0; i < len; i++) {
                if (arr[i] == num)
                    return 1;
            }
            return 0;
        }

        int main() {
            int numbers[] = {1, 1, 2, 2, 2, 3, 4, 5, 6, 6, 7, 7, 7, 8, 9};
            for (size_t i = 0; i < SIZEOF_ARRAY(numbers) - 1; ++i) {
                if (contains(numbers, i, numbers[i]))
                    continue;
                if (contains(numbers + i + 1, SIZEOF_ARRAY(numbers) - i, numbers[i]))
                    printf("Number %d has duplicate values\n", numbers[i]);
            }
            return 0;
}


