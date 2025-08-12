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
   
    FILE* fp = fopen("filename.txt", "r");
    char line[1024];

    if (!fp) return 1;

    while (fgets(line, sizeof line, fp)) {
        fputs(line, stdout);
    }
    fclose(fp);
    
    return 0;
}


