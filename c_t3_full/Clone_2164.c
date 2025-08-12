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
    int n;
    char *txt[4];
    FILE *f = fopen("file.txt", "r");
    for (n = 0; n < 4; n++) {
        txt[n] = malloc(128);
        fscanf(f, "%127s", txt[n]);
    }
    for (n = 0; n < 4; n++)
        printf("Line %d: %s\n", n, txt[n]);
    for (n = 0; n < 4; n++)
        free(txt[n]);
    return 0;
}


