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
    char buf[256];
    FILE *file = fopen("test.txt", "r");
    while (fgets(buf, sizeof(buf), file)) {
        printf("%s", buf);
    }
    fclose(file);
    return 0;
}


