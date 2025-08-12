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
#define STR_SIZE 1024


int main() {
    char s1[] = "rock";
    char s2[] = "and";
    char s3[] = "roll";
    char result[1024] = {0};
    sprintf(result, "%s %s %s", s1, s2, s3);
    printf("%s\n", result);
}


