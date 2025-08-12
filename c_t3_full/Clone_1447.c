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
    
     memmove(result, s1, strlen (s1)+1);
     memmove(result + strlen(s1)+1, s2, strlen (s2)+1);
     memmove(result + strlen(s1) + strlen(s2) +1, s3, strlen(s3)+1);
     printf("%s\n", result);
 
     return 0;
}


