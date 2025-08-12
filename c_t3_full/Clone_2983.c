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



#define STR_SIZE 1024
int main() {
   char s1[] = "read";
   char s2[] = "write";
   char s3[] = "execute";
   char result[STR_SIZE];
   sprintf(result, "%s %s %s", s1, s2, s3);
   printf("%s\n", result);
}


