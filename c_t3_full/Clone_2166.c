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
    int r;
    char *textArray[4];
    FILE *fg = fopen("source.txt", "r");
    for (r = 0; r < 4; r++) {
        textArray[r] = malloc(128);
        fscanf(fg, "%127s", textArray[r]);
    }
    for (r = 0; r < 4; r++)
        printf("Line %d: %s\n", r, textArray[r]);
    for (r = 0; r < 4; r++)
        free(textArray[r]);
    return 0;
}


