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
        int i=0;
        while (s1[i] != '\0') {
            result[i] = s1[i];
            i++;
        }
        int j=0;
        while (s2[j] != '\0') {
            result[i+j] = s2[j];
            j++;
        }    
        int k=0;       
        while (s3[k] != '\0') {
            result[i+j+k] = s3[k];
            k++;
        }
        printf("%s\n", result);
    }
}


