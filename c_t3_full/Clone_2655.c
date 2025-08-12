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
    char txt[1000];
    FILE *f = fopen("test.txt", "r");
    fscanf(f, "%[^EOF]", txt);
    printf("%s", txt);
    fclose(f);
    return 0;
}


