int main (void) {
    int i, n;
    printf ("Input the size of array :");
    scanf ("%d", & n);
    int x [n];
    printf ("Input %d elements in the array :\n", n);
    for (i = 0; i < n; i++) {
        printf ("x[%d]: ", i);
        scanf ("%d", & x [i]);
    }
    int first = x[0];
    int second = x[0];
    for (i = 0; i < n; ++i) {
        if (first < x[i]) {
            second = first;
            first = x[i];
        }
        else if (x[i] > second && x[i] != first) {
            second = x[i];
        }
    }
    if (second == first)
        printf ("There is no second largest element\n");
    else
        printf ("\nThe Second largest element in the array is: %d", second);
    return 0;
}


int main (void) {
    int i, n;
    printf ("Input the size of array: ");
    scanf ("%d", &n);
    int x [n];
    printf ("Input %d elements in the array:\n", n);
    for (i = 0; i < n; i++) {
        printf ("x[%d]: ", i);
        scanf ("%d", &x[i]);
    }
    int largest = x[0];
    int secondLargest = x[0];
    for (i = 0; i < n; ++i) {
        if (largest < x[i]) {
            secondLargest = largest;
            largest = x[i];
        } else if (x[i] > secondLargest && x[i] != largest) {
            secondLargest = x[i];
        }
    }
    if (secondLargest == largest)
        printf ("There is no second largest element\n");
    else
        printf ("\nThe Second largest element in the array is: %d", secondLargest);
    return 0;
}
