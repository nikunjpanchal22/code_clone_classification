int main () {
    FILE *pfile;
    int data;
    pfile = fopen ("test.txt", "r");
    printf ("Opening file...\n");
    if (pfile == NULL) {
        printf ("Error!\n");
    }
    while ((data = fgetc (pfile)) != EOF) {
        if (data >= 65 && data <= 90) {
            printf ("%c\n", data);
        }
    }
    fclose (pfile);
    return 0;
}




#include <ctype.h>
int main () {
    FILE *pfile = fopen ("test.txt", "r");
    printf ("Opening file...\n");
    if (!pfile) {
        puts("Error!");
        return 1;
    }
    for (int c; (c = fgetc(pfile)) != EOF;) {
        if (isupper(c)) {
            putchar(c); 
            putchar('\n');
        }
    }
    fclose(pfile);
    return 0;
}


