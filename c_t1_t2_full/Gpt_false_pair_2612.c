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
    char s4[] = "Hey"; 
    char s5[] = "there"; 
    char s6[] = "buddy"; 
    { 
        char result[STR_SIZE] = {0}; 
        snprintf(result, sizeof(result), "%s %s %s", s4, s5, s6); 
        printf("%s\n", result); 
    } 
}
