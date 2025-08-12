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
    int largest, smallest;
    printf ("Enter four integers (separate them with spaces): ");
    scanf ("%d %d %d %d", &a, & b, & c, & d);
    largest = a;
    smallest = a;
    if (largest > b) {
        largest = a;
    }
    else {
        largest = b;
    }
    if (largest > c) {
        largest = largest;
    }
    else {
        largest = c;
    }
    if (largest > d) {
        largest = largest;
    }
    else {
        largest = d;
    }

    if (smallest < b) {
        smallest = a;
    }
    else {
        smallest = b;
    }
    if (smallest < c) {
        smallest = smallest;
    }
    else {
        smallest = c;
    }
    if (smallest < d) {
        smallest = smallest;
    }
    else {
        smallest = d;
    }

    printf ("\nLargest: %d\n", largest);
    printf ("Smallest: %d\n", smallest);
    return 0;
}


