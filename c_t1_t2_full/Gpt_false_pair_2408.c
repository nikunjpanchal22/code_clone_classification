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
    int a[n];
    printf ("Input %d elements in the array:\n", n);
    for (i = 0; i < n; i++) {
        printf ("a[%d]: ", i);
        scanf ("%d", &a[i]);
    }
    int maxNum = a[0];
    int secondMax = a[0];
    for (i = 0; i < n; ++i) {
        if (maxNum < a[i]) {
            secondMax = maxNum;
            maxNum = a[i];
        } else if (a[i] > secondMax && a[i] != maxNum) {
            secondMax = a[i];
        }
    }
    if (secondMax == maxNum)
        printf ("There is no second largest element\n");
    else
        printf ("\nThe Second largest element in the array is: %d", secondMax);
    return 0;
}
