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
    int t;
    char *buffer[4];
    FILE *fhandle = fopen("readme.txt", "r");
    for (t = 0; t < 4; t++) {
        buffer[t] = malloc(128);
        fscanf(fhandle, "%127s", buffer[t]);
    }
    for (t = 0; t < 4; t++)
        printf("Line %d: %s\n", t, buffer[t]);
    for (t = 0; t < 4; t++)
        free(buffer[t]);
    return 0;
}


