int main (void) {
    int i, size;
    printf ("Enter total number of elements (1 to 100): \n");
    if (scanf ("%d", &size) != 1) {
        fprintf (stderr, "Error in input");
        exit (1);
    }
    if (size < 1 && size > 100) {
        fprintf (stderr, "Wrong input.");
        exit (1);
    }
    float num [size];
    for (i = 0; i < size; i++) {
        printf ("Enter Number %d: ", i);
        if (scanf ("%f", &num[i]) != 1) {
            fprintf (stderr, "Error in input");
            exit (1);
        }
    }
    printf ("Largest Number: %f", mymaximum (size, num));
    return 0;
}





#include <stdio.h>
#include <stdlib.h>

float getMax (int s, float arr[]);

int main (void) {
    int i, s;
    printf ("Enter total number of elements (1 to 100): \n");
    scanf ("%d", &s);
    if (s < 1 || s > 100) {
        fprintf(stderr, "Wrong input.");
        exit (1);
    }
    float arr [s];

    for (i = 0; i < s; i++) {
        printf("Enter Num %d: ", i);
        scanf("%f", &arr[i]);
    }
    printf("Largest Number: %f", getMax(s, arr));
    return 0;
    }

float getMax(int s, float arr[]) {
    int i;
    float max = arr[0];
    for (i = 1; i < s; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}


