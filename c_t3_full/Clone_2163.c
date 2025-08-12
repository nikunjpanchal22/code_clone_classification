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
    int p;
    char *str[4];
    FILE *fptr = fopen("document.txt", "r");
    for (p = 0; p < 4; p++) {
        str[p] = malloc(128);
        fscanf(fptr, "%127s", str[p]);
    }
    for (p = 0; p < 4; p++)
        printf("Line %d: %s\n", p, str[p]);
    for (p = 0; p < 4; p++)
        free(str[p]);
    return 0;
}


