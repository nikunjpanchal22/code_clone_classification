int main (void) {
    char filename [100];
    for (j = 0; j < 10; j++) {
        sprintf (filename, "C:\\playlist%d.txt", j + 1);
        string = fopen (filename, "w+t");
        fclose (string);
    }
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
int main() {
    int j = 0;
    char filename[100];
    while (j < 10) {
        sprintf(filename, "C:\\playlist%d.txt", j + 1);
        FILE *fd = fopen(filename, "w+t");
        fclose(fd);
        j++;
    }
    return EXIT_SUCCESS;
}


