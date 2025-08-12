int main () {
    int a [] = {10, 2, 6, 3, 5, 9, 8, 4, 7};
    int l = sizeof a / sizeof a[0];
    int i, j;
    int check = 1;
    for (i = 0; i < l; i++) {
        check = 1;
        for (j = i + 1; j < l; j++) {
            if (a[i] >= a[j]) {
                check = 0;
            }
        }
        if (check)
            printf ("%d", a[i]);
    }
    printf ("\n");
    return 0;
}





#include <stdio.h>

#define ARR_LEN(arr) (sizeof(arr)/sizeof(arr[0]))

int main(void) {
    int nums[] = {10, 2, 6, 3, 5, 9, 8, 4, 7};

    for (int i = 0; i < ARR_LEN(nums); i++){
        int isLargest = 1;
        for (int j = i + 1; j < ARR_LEN(nums); j++)
            if (nums[i] >= nums[j]) {
                isLargest = 0;
                break;
            }

        if (isLargest) printf ("%d ", nums[i]);
    }

    printf ("\n");
    return 0;
}


