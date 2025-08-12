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
    FILE *fp;
    char c;

    fp = fopen("filename.txt", "r");
    if (fp == NULL) return 1;

    while( (c = fgetc(fp)) != EOF ) {
        putchar(c);
    }
    fclose(fp);
    return 0;
}


