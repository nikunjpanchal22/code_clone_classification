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

int main() {
    FILE *file;
    char line[1024];

    file = fopen("filename.txt", "r");
    
    if (file) {
        while (fscanf(file, "%1023s\n", line) != EOF) {
            printf("%s\n", line);
        }
        fclose(file);
    }
    
    return 0;
}


