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

int main (int argc, char *argv []) {
    int* src = (int*)malloc(argc*sizeof(int));
    int* dest = (int*)malloc(argc*sizeof(int));
    int cur, max = -1, n = argc - 1;
    for (int i = 0; i < n; i++) {
        src[i] = cur = atoi (argv[i + 1]);
        if (max < cur) max = cur;
    }
    max < 9 ? encode9 (dest, src, n) : encode64 (dest, src, n);
    for (int i = 0; i < n; i++) printf ("%d ", dest[i]);
    printf ("\n");
    free(src);
    free(dest);
    return 0;
}


