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


 int main () {
    char s1 [] = "oppa";
    char s2 [] = "gangnam";
    char s3 [] = "style";
    {
        char result[STR_SIZE] = {0};
        int len = strlen(s1) + strlen(s2) + strlen(s3);
        if (len < STR_SIZE) {
            strcat(result, s1);
            strcat(result, s2);
            strcat(result, s3);
            printf("%s\n", result);
        }
    }
}


