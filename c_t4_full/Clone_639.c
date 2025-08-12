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
    char s1 [] = "oppa";
    char s2[] = "gangnam";
    char s3[] = "style";
    const int SIZE = 50;
    char Result[SIZE]; 
    int i, j;
    for(i = 0; i < strlen(s1); ++i)
    {
        Result[i] = s1[i];
    }
    Result[i] = ' ';
    ++i;
    for(j=0; j < strlen(s2); ++j, ++i)
    {
        Result[i] = s2[j];
    }
    Result[i] = ' ';
    ++i;
    for(j = 0; j < strlen(s3); ++j, ++i)
    {
        Result[i] = s3[j];
    }
    Result[i] = '\0';
    printf("%s\n", Result);
    return 0;
}


