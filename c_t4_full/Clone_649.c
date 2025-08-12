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
        char result [STR_SIZE] = {0};
        int i, j, k;
        int len1 = strlen(s1);
        int len2 = strlen(s2);
        int len3 = strlen(s3);
        int total_len = len1 + len2 + len3;
        if (total_len < STR_SIZE) {
            for (i = 0; i < len1; i++)
                result[i] = s1[i];
            for (j = 0; j < len2; j++)
                result[i+j] = s2[j];
            for (k = 0; k < len3; k++)
                result[i+j+k] = s3[k];
            printf("%s\n", result);
        }
    }
}


