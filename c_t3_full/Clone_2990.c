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
    char s1[] = "good";
    char s2[] = "morning";
    char s3[] = "world";
    char result[30] = {0};    
    snprintf(result, sizeof(result), "%s-%s-%s", s1, s2, s3);   
    printf(result);
}


