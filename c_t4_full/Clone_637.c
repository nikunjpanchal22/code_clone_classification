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
    const int max_len = 50;
    char s1[] = "oppa";
    char s2[] = "gangnam";
    char s3[] = "style";
    char result[max_len];
    int i = 0;
    
    while (i < strlen(s1)) {
        result[i] = s1[i];
        ++i;
    }
    result[i++] = ' ';
    int j = 0;
    while (j < strlen(s2)) {
        result[i] = s2[j];
        ++i;
        ++j;
    }
    result[i++] = ' ';
    int k = 0;
    while (k < strlen(s3)) {
        result[i] = s3[k];
        ++i;
        ++k;
    }
    result[i] = '\0';
    printf("%s\n", result);
    
    return 0;
}


