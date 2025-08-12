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
    char *lines[4];
    FILE *f;

    f = fopen("stack.txt", "r");

    for(int i=0; i<4; i++) {
        lines[i] = malloc(500);
        fgets(lines[i], 500, f);
    }

    for(int i=0; i<4; i++) {
        printf("Line= %d %s", i+1, lines[i]);
    }

    for(int i=0; i<4; i++){
        free(lines[i]);
    }

    fclose(f);
    return 0;
}


