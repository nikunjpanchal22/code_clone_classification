int main () {
    char line [1024];
    FILE *fp = fopen ("filename.txt", "r");
    if (fp == NULL) {
        return 1;
    }
    while (fgets (line, 1024, fp)) {
        printf ("%s\n", line);
    }
    return 0;
}





#include <stdio.h>

void main() {
    FILE *file;
    file = fopen("filename.txt", "r");
    char line[1024];

    if (file) {
        while (fscanf(file, "%s", line)!=EOF)
            printf("%s\n", line);
        fclose(file);
    }
}


