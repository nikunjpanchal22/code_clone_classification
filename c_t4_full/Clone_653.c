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



 int main() {
    char s1[] = "oppa";
    char s2[] = "gangnam";
    char s3[] = "style";
    {
        char result[STR_SIZE] = {0};
        int i, j, k;
        for (i = 0, j = 0, k = 0; s1[i] != '\0' || s2[j] != '\0' || s3[k] != '\0'; i++, j++, k++) {
            if (s1[i] != '\0')
                result[i] = s1[i];
            if (s2[j] != '\0')
                result[i+j] = s2[j];
            if (s3[k] != '\0')
                result[i+j+k] = s3[k];
        } 
        printf("%s\n", result); 
    }
}


