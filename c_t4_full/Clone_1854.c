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
    int values[4];
    printf("Enter four integers: ");
    scanf("%d %d %d %d", &values[0], &values[1], &values[2], &values[3]); 
    int largest = values[0]; 
    int smallest = values[0]; 
    for (int i = 1; i < 4; i++) { 
        if (values[i] > largest){ largest = values[i]; } 
        if (values[i] < smallest){ smallest = values[i]; } 
    } 
    printf("\nLargest: %d\n", largest); 
    printf("Smallest: %d", smallest); 
    return 0;
}


