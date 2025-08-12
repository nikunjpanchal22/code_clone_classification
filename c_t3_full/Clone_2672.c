int main (void) {
    char filename [100];
    for (j = 0; j < 10; j++) {
        sprintf (filename, "C:\\playlist%d.txt", j + 1);
        string = fopen (filename, "w+t");
        fclose (string);
    }
    return 0;
}





#include<stdio.h>
#define SIZE 100
int main(void) {
    int j;
    char filename[SIZE];
    FILE* file;
    for(j = 0; j < 10; j++) {
        sprintf(filename, "C:\\playlist%d.txt", j + 1);
        file = fopen(filename, "w+t");
        fclose(file);
    }
    return 0;
}


