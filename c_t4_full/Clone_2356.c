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

float largestNumber(int size, float num[]);

int main(void) {
    int i;
    int size;

    printf("Enter total number of digits (1 to 100): \n");
    scanf("%d", &size);

    if(size < 1 || size > 100) {
        printf("Enter correct size between 1-100\n");
        return 0;
    }
    
    float num[size];
    for (i = 0; i < size; i++) {
        printf("Enter Number %d: ", i);
        scanf("%f", &num[i]);
    }

    printf("Largest Number: %f", largestNumber(size, num));
    return 0;
    }

float largestNumber(int size, float num[]) {
    int i;
    float max = num[0];
    for(i = 1; i < size; i++) {
        if(num[i] > max) {
            max = num[i];
        }
    }
    return max;
}


