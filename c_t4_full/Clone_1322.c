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

int main () {
    FILE *fp = fopen("test.txt", "r");
    char *lines[4];

    for(int i=0; i<4; i++) {
        lines[i] = malloc(256 * sizeof(char));
        fscanf(fp, "%s", lines[i]);
    }

    for(int i=0; i<4; i++)
        printf("Line %i: %s\n", i+1, lines[i]);

    for(int i=0; i<4; i++)
        free(lines[i]);

    fclose(fp);
    return 0;
}


