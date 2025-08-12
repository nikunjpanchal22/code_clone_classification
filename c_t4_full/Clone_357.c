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
    int arr[4];
    int largest_index, smallest_index;

    printf ("Enter four integers (separate them with spaces): ");
    scanf ("%d %d %d %d", & a, & b, & c, & d);
    arr[0] = a;
    arr[1] = b;
    arr[2] = c;
    arr[3] = d;

    largest_index = 0;
    for (int i = 0; i < 4; i++) {
        if (arr[i] > arr[largest_index]) {
            largest_index = i;
        }
    }
    smallest_index = 0;
    for (int i = 0; i < 4; i++) {
        if (arr[i] < arr[smallest_index]) {
            smallest_index = i;
        }
    }

    printf ("\nLargest: %d\n", arr[largest_index]);
    printf ("Smallest: %d\n", arr[smallest_index]);
    return 0;
}


