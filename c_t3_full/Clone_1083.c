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
    int j, p, n = sizeof (a) / sizeof (a[0]);
    int smallest_index = 0; // Stores the index of the smallest element
    p = a[smallest_index];
    
    // Iterate each element in the array 
    for (j = 0; j < n; j++) {
        // Compare current element with the smallest element
        if (a[j] < p) {
            // Set the current element index as the smallest index
            smallest_index = j;
            // Set the current element as the smallest element
            p = a[smallest_index];
        }
    }
    
    // Print out the smallest element 
    printf ("%d ", p);
    
    // Use a loop to find the next smallest element until the array ends
    for(int i = smallest_index + 1; i < n; i++) {
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


