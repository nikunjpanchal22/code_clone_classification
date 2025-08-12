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
    int i;
    char *lines[4];
    FILE *fs;
    fs = fopen("link.txt", "r");

    for(i=0; i<4; i++) {
        lines[i] = (char *) malloc(100 * sizeof(char));
        fgets(lines[i], 100, fs);
    }

    for(i=0; i<4; i++)
        printf("Line[%i]:%s", i, lines[i]);

    for(i=0; i<4; i++)
        free(lines[i]);

    fclose(fs);
    return 0;
}


