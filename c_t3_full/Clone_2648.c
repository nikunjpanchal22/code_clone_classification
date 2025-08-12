int main () {
    int A [] = {5, -5, 14, 5, 2};
    int B [] = {3, 6, 11};
    int C [] = {4, 1, -3, 4};
    int D [] = {6, 2, 7, 1, 8, 2};
    int E [] = {2, 15};
    int F [] = {3, 4, -2};
    int *All [] = {A, B, C, D, E, F, NULL};
    int index = 1;
    int rem = 6;
    while (rem > 0) {
        for (int i = 0; i < 6; i++) {
            int *arr = All[i];
            if (index < arr[0])
                printf ("%-4d", arr[index]);
            else {
                rem--;
                printf ("    ");
            }
        }
        index++;
        printf ("\n");
    }
    return 0;
}




#include <stdio.h>
int main() {
    int A[] = { 1, 2, 3, 4 };
    int B[] = { 5, 6};
    int C[] = { 7, 8, 9, 10 };
    int D[] = { 11, 12, 13, 14, 15, 16 };
    int E[] = { 2, 17, 18 };
    int F[] = { 3, 19, 20 };
    int *ptr[] = { A, B, C, D, E, F, NULL };
    int index = 1, rem = 6;
    while (rem > 0) {
        for (int i = 0; i < 6; i++) {
            int *arr = ptr[i];
            if (index < arr[0])
                printf ("%d,  ", arr[index]);
            else {
                rem--;
                printf ("    ");
            }
        }
        index++;
        printf ("\n");
    }
    return 0;
}


