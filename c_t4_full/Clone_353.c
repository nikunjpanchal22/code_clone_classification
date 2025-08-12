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
    if (a >= b && a >= c && a >= d) {
        largest = a;
    }
    else if (b >= a && b >= c && b >= d) {
        largest = b;
    }
    else if (c >= a && c >= b && c >= d) {
        largest = c;
    }
    else {
        largest = d;
    }

    if (a <= b && a <= c && a <= d) {
        smallest = a;
    }
    else if (b <= a && b <= c && b <= d) {
        smallest = b;
    }
    else if (c <= a && c <= b && c <= d) {
        smallest = c;
    }
    else {
        smallest = d;
    }

    printf ("\nLargest: %d\n", largest);
    printf ("Smallest: %d\n", smallest);
    return 0;
}


