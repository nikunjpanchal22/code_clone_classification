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
    int m;
    char *line[4];
    FILE *fh = fopen("myfile.txt", "r");
    for (m = 0; m < 4; m++) {
        line[m] = malloc(128);
        fscanf(fh, "%127s", line[m]);
    }
    for (m = 0; m < 4; m++)
        printf("Line %d: %s\n", m, line[m]);
    for (m = 0; m < 4; m++)
        free(line[m]);
    return 0;
}


