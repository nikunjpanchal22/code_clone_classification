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
    int s;
    char *input[4];
    FILE *handle = fopen("inputFile.txt", "r");
    for (s = 0; s < 4; s++) {
        input[s] = malloc(128);
        fscanf(handle, "%127s", input[s]);
    }
    for (s = 0; s < 4; s++)
        printf("Line %d: %s\n", s, input[s]);
    for (s = 0; s < 4; s++)
        free(input[s]);
    return 0;
}


