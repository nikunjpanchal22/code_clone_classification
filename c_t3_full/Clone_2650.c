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
int main () {
    FILE *f;
    int n;
    char buf[1024];
    f = fopen("test.txt", "r");
    while((n = fread(buf, 1, sizeof buf - 1, f)) > 0) {
        buf[n] = '\0';
        printf("%s", buf);
    }
    fclose(f);
    return 0;
}


