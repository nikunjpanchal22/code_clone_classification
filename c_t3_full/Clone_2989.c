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
    char s1[] = "music";
    char s2[] = "is";
    char s3[] = "life";
    char result[100]; 
    snprintf(result, sizeof(result), "%s.%s.%s", s1, s2, s3);
    fputs(result,stdout);
}


