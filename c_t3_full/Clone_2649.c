int main () {
    FILE *f;
    char c;
    f = fopen ("test.txt", "rt");
    while ((c = fgetc (f)) != EOF) {
        printf ("%c", c);
    }
    fclose (f);
    return 0;
}





#include <stdio.h>
int main() {
    char c; 
    FILE* f = fopen("test.txt", "r"); 
    while (1) {
        c = fgetc(f);
        if (c == EOF) break; 
        printf("%c", c);
    }
    fclose(f); 
    return 0; 
}


