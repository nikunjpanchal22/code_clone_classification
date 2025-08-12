int main (void) {
    int a [] = {10, 2, 6, 3, -1, 5, 9, 8, 4, 7};
    int i, j, p, n = sizeof (a) / sizeof (a[0]);
    p = a[0];
    i = 0;
    for (j = i + 1; j < n; j++) {
        if (a[j] < p) {
            i = j;
            p = a[i];
        }
    }
    printf ("%d ", p);
    i = find_next (a, n, i +1, p);
    while (i < n) {
        p = a[i];
        printf ("%d ", p);
        i = find_next (a, n, i +1, p);
    }
    printf ("\n");
    return 0;
}


 int main (void) {
    int a [] = {10, 2, 6, 3, -1, 5, 9, 8, 4, 7};
    int i, j, p, n = sizeof (a) / sizeof (a[0]);
    p = a[0];
    i = 0;
    for (j = 0; j < n; j++) {
        // Compare current element to the smallest element
        if (a[j] < p) {
            // Set the current element index as the smallest index
            i = j;
            // Set the current element as the smallest element
            p = a[i];
        }
    }
    // Print out the smallest element 
    printf ("%d ", p);
    // Iterate each element from the second smallest element
    for (i = i + 1; i < n; i++) {
        // Use a loop to find the next smallest element 
        int current_smallest_index = find_next (a, n, i, p);
        if (current_smallest_index < n) {
            p = a[current_smallest_index];
            printf ("%d ", p);
        }
    }
    printf ("\n");
    return 0;
}
