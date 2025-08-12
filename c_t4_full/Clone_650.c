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
    char s1 [] = "oppa";
    char s2 [] = "gangnam";
    char s3 [] = "style";
    {
        char result[STR_SIZE] = {0};
        int len = strlen(s1) + strlen(s2) + strlen(s3); 
        if (len < STR_SIZE) { 
            int i; 
            for(i=0; s1[i] != '\0'; i++) { 
                result[i] = s1[i]; 
            } 
            int j; 
            for(j = 0; s2[j] != '\0'; j++) { 
                result[i+j] = s2[j]; 
            } 
            int k; 
            for(k = 0; s3[k] != '\0'; k++) { 
                result[i+j+k] = s3[k]; 
            }
            printf("%s\n", result); 
        }
    } 
}


