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
    char ch;

    if (fp == NULL) {
        return 1;
    }
    
    while ((ch = fgetc(fp)) != EOF) {
        putchar(ch);
    }
    
    return 0;
}


