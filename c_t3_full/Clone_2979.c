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



 

#include <stdio.h>

#define STR_SIZE 40

int main() {
    char s_out[] = "oppa gangnam style";
    char result[STR_SIZE] = {0};
    snprintf(result, sizeof(result), "%s", s_out);
    printf("%s\n", result);
    return 0;
}


