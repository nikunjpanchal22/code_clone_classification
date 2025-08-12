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
    // Set the initial smallest element to the first element in the array
    p = a[0];
    i = 0;
    // Iterate each element in the array, starting from the second element
    for (j = 1; j < n; j++) {
        // Compare current element with the smallest element
        if (a[j] < p) {
            // Set the smallest index as the current element index 
            i = j;
            // Set the smallest element as the current element
            p = a[i];
        }
    }
    // Print out the smallest element 
    printf ("%d ", p);
    // Iterate from the second smallest element in the array 
    for (i = i + 1; i < n; i++) {
        // Find the smallest element from the remaining array
        int next_smallest = find_next(a, n, i, p);
        // If smallest element is found, print it out
        if(next_smallest < n) {
            p = a[next_smallest];
            printf ("%d ", p);
        }
    }
    // Terminate the line
    printf ("\n");
    
    return 0;
}
