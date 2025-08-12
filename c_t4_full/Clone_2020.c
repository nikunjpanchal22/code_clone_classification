int main (void) {
    do {
        int boundary = getBoundary ();
        int ssq = computeSSQ (boundary);
        printf ("The sum of the squares of integers from 0 to %d is %d\n", boundary, ssq);
    }
    while (again ());
    return 0;
}





#include<stdio.h>

int getBoundary() {
    int boundary;
    printf("Enter the boundary: ");
    scanf("%d", &boundary);
    return boundary;
}


