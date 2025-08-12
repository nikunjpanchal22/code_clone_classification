int main () {
    const char *s = "/products/product_code1233213/image.jpg";
    const char *p = s, *begin = s, *end = s;
    char *result;
    size_t len;
    while (p) {
        p = strchr (p, '/');
        if (p) {
            begin = end;
            end = ++p;
        }
    }
    if (begin != end) {
        len = end - begin - 1;
        result = malloc (len +1);
        memcpy (result, begin, len);
        result[len] = '\0';
        printf ("%s\n", result);
        free (result);
    }
    return 0;
}


 
int main() 
{ 
    const char *s = "/products/product_code1233213/image.jpg"; 
    const char *beginingOfSubstring, *endOfSubstring; 
    char *result; 
    size_t len; 
    beginingOfSubstring = s; 
  
    for (int i = 0; i<strlen(s); i++) { 
        if(s[i]=='/' && s[i+1]!='/') 
            beginingOfSubstring = &s[i+1]; 
        if(s[i]=='/' && s[i+1]=='/') 
            endOfSubstring = &s[i]; 
    } 
  
    len = endOfSubstring - beginingOfSubstring; 
    result = malloc (len +1); 
    memcpy (result, beginingOfSubstring, len); 
    result[len] = '\0'; 
    printf ("%s\n", result); 
    free (result); 
    return 0; 
} 


