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
int main() {
    for(int j = 0; j < 10; j++) {
        char file_name[100];
        sprintf(file_name, "C:\\playlist%d.txt", j + 1);
        FILE* file_ptr = fopen(file_name, "w+t");
        fclose(file_ptr);
    }
    return 0;
}


