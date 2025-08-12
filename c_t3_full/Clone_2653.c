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
int main (){
    FILE *f = fopen("test.txt", "r");
    char c;
    while ((c = getc(f)) != EOF) putchar(c);
    fclose(f);
    return 0;
}


