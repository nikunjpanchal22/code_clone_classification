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
    FILE* fp = fopen("test.txt", "r"); 
    if(fp != NULL) {
        while(!feof(fp)) {
            char ch = fgetc(fp);
            if(ferror(fp)) {
                break;
            }
            printf("%c", ch);
        }
        fclose(fp);
    }
    return 0;
}


