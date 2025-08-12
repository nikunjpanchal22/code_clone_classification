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
    int temp;
    printf ("Enter four integers (separate them with spaces): ");
    scanf ("%d %d %d %d", &a, & b, & c, & d);

    arr[0] = a;
    arr[1] = b;
    arr[2] = c;
    arr[3] = d;

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        if (arr[j] > arr[j+1]) {
            temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
      }
    }

    printf ("\nLargest: %d\n", arr[3]);
    printf ("Smallest: %d\n", arr[0]);
    return 0;
}


