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
#define MAX 10
int main() {
    for (int j = 0; j < MAX; j++) {
        char filename[100];
        sprintf(filename, "C:\\playlist%d.txt", j + 1);
        FILE* file = fopen(filename, "w+t");
        fclose(file);
    }
    return 0;
}


