int main (int argc, char *argv []) {
    int src [argc], dest [argc];
    int cur, max = 0, n = argc - 1;
    for (int i = 0; i < n; i++) {
        src[i] = cur = atoi (argv[i + 1]);
        if (max < cur)
            max = cur;
    }
    if (max < 9) {
        encode9 (dest, src, n);
    }
    else {
        encode64 (dest, src, n);
    }
    for (int i = 0; i < n; i++) {
        printf ("%d ", dest [i]);
    }
    printf ("\n");
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#define MAX(arr, n) for (int i = 0; i < n; i++) { if (max < arr[i]) max= arr[i]; }
#define SET_DATA(arr, argc, argv)  for (int i = 0; i < n; i++) arr[i] = atoi (argv[i + 1]);
#define PRINT_DATA(arr, n) for (int i = 0; i < n; i++) printf ("%d ", arr[i]); printf ("\n");

int main (int argc, char *argv []) {
    int data[argc], dest[argc];
    int max = 0, n = argc - 1;
    SET_DATA(data, argc, argv);
    MAX(data, n);
    if (max < 9) encode9 (dest, data, n);
    else encode64 (dest, data, n);
    PRINT_DATA(dest, n);
    return 0;
}


