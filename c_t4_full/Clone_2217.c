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
    FILE *f = fopen("test.txt", "r");
    fseek(f, 0, SEEK_END);
    long fsize = ftell(f);
    fseek(f, 0, SEEK_SET); 
    char *str = malloc(fsize + 1);
    fread(str, 1, fsize, f);
    fclose(f);
    str[fsize] = 0;
    printf("%s", str);
    return 0;
}


