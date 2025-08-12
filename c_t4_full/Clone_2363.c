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

float get_maximum (int size, float num[]);

int main (void) {
    int i, size;
    printf ("Enter total number of elements (1 to 100): \n");
    scanf ("%d", &size);
    if (size < 1 || size > 100) {
        fprintf (stderr, "Wrong input.");
        return 1;
    }

    float num [size];

    for (i = 1; i <= size; i++) {
        printf ("Enter Num %d: ", i);
        scanf ("%f", &num[i-1]);
    }

    printf ("Largest Numeric: %f", get_maximum (size, num));
    
    return 0;
    }

float get_maximum (int size, float num[]) {
    int i;
    float maximum = num[0];

    for (i = 1; i < size; i++) {
        if (num[i] > maximum) {
            maximum = num[i];
        }
    }
    return maximum;
}


