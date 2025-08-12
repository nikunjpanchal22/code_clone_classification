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





#include <stdio.h>
int main(void) {
	    int arr[4];
	    printf("Enter four numbers:\n");
	    for(int i=0; i<4; i++) scanf("%d", &arr[i]);
	    int largest=arr[0];
	    int smallest=arr[0];
	    for(int i=1; i<4; i++){
		if(arr[i] > largest) largest = arr[i];
		if(arr[i] < smallest) smallest = arr[i];
	    }
	    printf("\nLargest = %d\n", largest);
	    printf("Smallest = %d", smallest);
	    return 0; 
}


