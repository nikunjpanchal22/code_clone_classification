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
    int length = strlen(s1) + strlen(s2) + strlen(s3) + 1; 
    char arr[length] = {0}; 
    snprintf(arr, sizeof(arr), "%s %s %s", s1, s2, s3); 
    printf("%s\n", arr);   
}  

 int main() 
{ 
    const char* s1 = "oppa"; 
    const char* s2 = "gangnam"; 
    const char* s3 = "style"; 
    char result[STR_SIZE] = {'\0'}; 
    snprintf(result, STR_SIZE, "%s %s %s", s1, s2, s3); 
    puts(result); 
}


