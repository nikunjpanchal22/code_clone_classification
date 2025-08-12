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
    // Initialize the smallest element index and value to the first element of the array
    p = a[0]; 
    i = 0;
    // Iterate each element in the array 
    for (j = i + 1; j < n; j++) {
        // Compare current element with the smallest element
        if (a[j] < p) {
            // Set the current element index as the smallest index
            i = j;
            // Set the current element as the smallest element
            p = a[i];
        }
    }
    // Print out the smallest element 
    printf ("%d ", p);
    // Use a loop to iterate through all the elements
    for(int k = i + 1; k < n; k++) {
        // Find the smallest element from the remaining array
        int next_smallest = find_next(a, n, k, p);
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
