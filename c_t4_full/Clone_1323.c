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
    FILE *fl = fopen("textfile.txt", "r");
    char *lines[4];

    for (int i = 0; i < 4; i++) {
        lines[i] = malloc(256);
        fgets(lines[i], 256, fl);
    }

    for (int i = 0; i < 4; i++){
        printf("\n LINE %i: %s", i+1, lines[i]);
    }

    for (int i = 0; i < 4; i++)
        free (lines[i]);

    fclose(fl);

    return 0;
}


