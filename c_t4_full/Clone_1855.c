int main (void) {
    int a, b, c, d;
    printf ("Enter four integers (separate them with spaces): ");
    scanf ("%d %d %d %d", & a, & b, & c, & d);
    if (!(a < b || a < c || a < d)) {
        printf ("\nLargest: %d\n", a);
    }
    else if (!(b < c || b < d)) {
        printf ("\nLargest: %d\n", b);
    }
    else if (!(c < d)) {
        printf ("\nLargest: %d\n", c);
    }
    else {
        printf ("\nLargest: %d\n", d);
    }
    if (!(b < a || c < a || d < a)) {
        printf ("Smallest: %d", a);
    }
    else if (!(c < b || d < b)) {
        printf ("Smallest: %d", b);
    }
    else if (!(d < c)) {
        printf ("Smallest: %d", c);
    }
    else {
        printf ("Smallest: %d", d);
    }
    return 0;
}





#include<stdio.h>
int main() {
    int array[4];
    printf("Enter four integers: ");
    scanf("%d %d %d %d", &array[0], &array[1], &array[2], &array[3]);
    int max = array[0];
    int min = array[0];
    for (int i = 1; i < 4; i++) {
        if (array[i] > max) { max = array[i]; }
        if (array[i] < min) { min = array[i]; }
    }
    printf("\nLargest: %d\n", max);
    printf("Smallest: %d", min);
    return 0;
}


