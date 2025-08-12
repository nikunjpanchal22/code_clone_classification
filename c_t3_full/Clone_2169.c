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
    int k;
    char *content[4];
    FILE *fhandle = fopen("resource.txt", "r");
    for (k = 0; k < 4; k++) {
        content[k] = malloc(128);
        fscanf(fhandle, "%127s", content[k]);
    }
    for (k = 0; k < 4; k++)
        printf("Line %d: %s\n", k, content[k]);
    for (k = 0; k < 4; k++)
        free(content[k]);
    return 0;
}


