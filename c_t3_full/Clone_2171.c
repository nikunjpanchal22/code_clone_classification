main () {
    int i;
    string array [4];
    FILE *my;
    my = fopen ("my.txt", "r");
    for (i = 0; i < 4; i++) {
        fscanf (data, "%" MAX_CHARS_STR "s", & array [i]);
        ungetc ('x', data);
        fscanf (data, "%*s");
    }
    fclose (my);
}



 

#include <stdio.h>

main() {
    char arr[4][100];
    char skip[100];
    FILE *my;
    my = fopen("my.txt","r");
    for (int i = 0; i < 4; i++) {
        fscanf(my, "%s", arr[i]);
        ungetc('x', my);
        fscanf(my, "%s", skip);
    }
    fclose(my);
}


