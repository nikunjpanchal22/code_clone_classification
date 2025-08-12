int main (int argc, const char *argv []) {
    int histogram [10000] = {0};
    int i;
    int *rectPtr = histogram;
    int size = 0;
    int retval = 0;
    printf ("Enter the number of elements \n");
    while ((retval = scanf ("%d", &size)) != EOF && (retval == 1)) {
        rectPtr = histogram;
        if (!size)
            return 0;
        printf ("Enter %d elements\n", size);
        for (i = 0; i < size; ++i) {
            scanf ("%d", rectPtr);
            rectPtr++;
        }
        printf ("%d\n", 1111111);
        printf ("Enter the number of elements: \n");
    }
    return 0;
}





#include <stdio.h>
int main (int argc, const char *argv []) {
    int arr[10000] = {0}, num=0;
    int *ptr = arr;
    puts("Input length of array");
    while ((num = scanf ("%d", ptr)) != EOF && (num==1)) {
        if (!*ptr)
            return 0;
        puts("Input array elements");
        for (int i = 0; i < *ptr; i++) {
            scanf("%d", ++ptr);
        }
        puts("1111111");
        puts("Input length of array");
    }
    return 0;
}


