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


 
int main (void) {
    int a, b, c, d;
    int largest = 0, smallest = 0;
    printf ("Enter four integers (separate them with spaces): ");
    scanf ("%d %d %d %d", & a, & b, & c, & d);

    if (a > largest) {
        largest = a;
    }
    if (b > largest) {
        largest = b;
    }
    if ( c > largest) {
        largest = c;
    }
    if (d > largest) {
        largest = d;
    }

    if (a < smallest) {
        smallest = a;
    }
    if (b < smallest) {
        smallest = b;
    }
    if (c < smallest) {
        smallest = c;
    }
    if (d < smallest) {
        smallest = d;
    }

    printf ("\nLargest: %d\n", largest);
    printf ("Smallest: %d\n", smallest);
    return 0;
}


