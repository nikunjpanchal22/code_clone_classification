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
    char result[STR_SIZE];
    strcpy (result, s1);

    int count = 0;
    int k = strlen (result);
    while (count < strlen (s2)) {
        result[k] = s2[count];
        k++;
        count++;
    }
    result[k] = ' ';
    count = 0;
    k++;
    while (count < strlen (s3)) {
        result[k] = s3[count];
        k++;
        count++;
    }
    result[k] = '\0';
    printf ("%s\n", result);
    return 0;
}


