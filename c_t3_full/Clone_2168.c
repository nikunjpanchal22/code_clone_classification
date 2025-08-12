int main (int argc, char *argv []) {
    int i;
    char *lines [4];
    FILE *file_handle = fopen ("my.txt", "r");
    for (i = 0; i < 4; ++i) {
        lines[i] = malloc (128);
        fscanf (file_handle, "%127s", lines [i]);
    }
    for (i = 0; i < 4; ++i)
        printf ("%d: %s\n", i, lines[i]);
    for (i = 0; i < 4; ++i)
        free (lines[i]);
    return 0;
}




#include <stdio.h>
#include <stdlib.h>

int main() {
    int q;
    char *buf[4];
    FILE *ff = fopen("input.txt", "r");
    for (q = 0; q < 4; q++) {
        buf[q] = malloc(128);
        fscanf(ff, "%127s", buf[q]);
    }
    for (q = 0; q < 4; q++)
        printf("Line %d: %s\n", q, buf[q]);
    for (q = 0; q < 4; q++)
        free(buf[q]);
    return 0;
}


