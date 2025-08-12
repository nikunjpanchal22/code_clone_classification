int main () {
    char string1 [11];
    char string2 [11];
    char string3 [11];
    char string4 [11];
    char string5 [11];
    char string6 [11];
    char string7 [11];
    char string8 [11];
    char string9 [11];
    FILE *fileReader = fopen ("text.txt", "r");
    if (fileReader) {
        fscanf (fileReader, "%10s %10s %10s %10s %10s %10s %10s %10s %10s", string1, string2, string3, string4, string5, string6, string7, string8, string9);
        printf ("Found: %s %s %s %s %s %s %s %s %s\n", string1, string2, string3, string4, string5, string6, string7, string8, string9);
        fclose (fileReader);
    }
    else {
        puts ("Error opening filestream!");
    }
    return 0;
}




#include <stdio.h>
#define MAX_LENGTH 11
int main () {
    char words[9][MAX_LENGTH];
    FILE *f = fopen("text.txt", "r");

    if (f) {
        for (int i = 0; i < 9; i++) {
            fscanf(f, "%s", words[i]);
        }
        printf("Found: ");
        for (int i = 0; i < 9; i++) {
            printf("%s ", words[i]);
        }
        fclose(f);
    } else {
        puts("Error opening file!");
    }
    return 0;
}


