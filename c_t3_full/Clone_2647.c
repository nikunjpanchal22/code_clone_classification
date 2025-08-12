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
    int N1[] = { 1, -1, -1, -1 };
    int N2[] = { 2, -2, -2 };
    int N3[] = { 3, -3, -3, -3 };
    int N4[] = { 4, -4, -4, -4, -4, -4 };
    int N5[] = { 2, -5, -5 };
    int N6[] = { 3, -6, -6 };
    int *All[] = { N1, N2, N3, N4, N5, N6, NULL };
    int index = 1;
    int rem = 6;
    while (rem > 0) {
        for (int i = 0; i < 6; i++) {
            int *arr = All[i];
            if (index < arr[0])
                printf ("%d   ", arr[index]);
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


