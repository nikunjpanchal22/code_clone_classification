int main (void) {
    int a [11] = {1, 2, 3, 4, 5, 11, 11, 11, 11, 16, 16};
    int a_size = sizeof (a) / sizeof (a[0]);
    print (a, a_size, "Before", "a");
    a_size = compact (a, a_size);
    print (a, a_size, "After", "a");
    int b [11] = {11, 1, 11, 3, 16, 2, 5, 11, 4, 11, 16};
    int b_size = sizeof (b) / sizeof (b[0]);
    print (b, b_size, "Before", "b");
    qsort (b, b_size, sizeof (b [0]), intcmp);
    print (b, b_size, "Sorted", "b");
    b_size = compact (b, b_size);
    print (b, b_size, "After", "b");
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#define ARR_SIZE(arr) (sizeof (arr) / sizeof ((arr)[0]))

int compare(const void * p, const void * q) {
	    return *(int*)p - *(int*)q;
	}

	int main() {
	    int a[] = {1, 2, 3, 4, 5, 11, 11, 11, 11, 16, 16};
	    qsort(a, ARR_SIZE(a), sizeof(int), compare);
	    for (int i = 0; i < ARR_SIZE(a); i++) { printf("%d ", a[i]);  }
	    return 0;
}


