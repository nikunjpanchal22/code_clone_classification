int main () {
    char s1 [] = "oppa";
    char s2 [] = "gangnam";
    char s3 [] = "style";
    {
        char result [STR_SIZE] = {0};
        snprintf (result, sizeof (result), "%s %s %s", s1, s2, s3);
        printf ("%s\n", result);
    }
}




#include <string.h>

int main() {
    char s1[] = "oppa";
    char s2[] = "gangnam";
    char s3[] = "style";
    char result[25];
    strcpy(result, s1);
    strcat(result, " ");
    strcat(result, s2);
    strcat(result, " ");
    strcat(result, s3);
    printf("%s\n", result);
    return 0;
}


