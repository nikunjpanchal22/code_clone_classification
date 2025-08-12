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
    FILE *f = fopen("test.txt", "r");
    for (c = getc(f); c != EOF; c = getc(f)) printf("%c", c); 
    fclose(f);
    return 0; 
}


