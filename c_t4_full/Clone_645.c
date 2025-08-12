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


 int main() 
{ 
    const char* s1 = "oppa"; 
    const char* s2 = "gangnam"; 
    const char* s3 = "style"; 
    char result[STR_SIZE]; 
    memset(result, 0, sizeof(result)); 
    snprintf(result, sizeof(result), "%s %s %s", s1, s2, s3);
    printf("%s\n", result);
}


