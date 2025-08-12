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
#include <cstdlib>

int main () {
    char *lines[4];
    FILE *fp = fopen("readme.txt", "r");

    for(int i=0; i<4; i++){
        lines[i] = (char *)malloc(1024);
        fscanf(fp, "%s", lines[i]);
    }

    for(int i=0; i<4; i++){
        printf("Line %d: %s\n", i, lines[i]);
    }

    for(int i=0; i<4; i++){
        free(lines[i]);
    }

    fclose(fp);
    return 0;
}


