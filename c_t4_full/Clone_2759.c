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
#define SIZE 11
int main () {
    char str1[SIZE], str2[SIZE], str3[SIZE], str4[SIZE], str5[SIZE], str6[SIZE], str7[SIZE], str8[SIZE], str9[SIZE];
    FILE *file = fopen("text.txt", "r");
    if (file != NULL) {
        fscanf(file, "%s %s %s %s %s %s %s %s %s", str1, str2, str3, str4, str5, str6, str7, str8, str9);
        printf("%s %s %s %s %s %s %s %s %s\n", str1, str2, str3, str4, str5, str6, str7, str8, str9);
        fclose(file);
    } else {
        puts("Error opening file!");
    }
    return 0;
}


