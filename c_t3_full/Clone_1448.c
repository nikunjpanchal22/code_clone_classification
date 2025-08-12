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


 int main () 
{
    char s1[] = "oppa";
    char s2[] = "gangnam";
    char s3[] = "style";

    int length = strlen(s1) + strlen(s2) + strlen(s3);

    char *result = (char*)calloc(length + 1, sizeof(char));

    snprintf(result, length + 1, "%s %s %s", s1, s2, s3);
    printf("%s\n", result);
    free(result);

    return 0;
} 


