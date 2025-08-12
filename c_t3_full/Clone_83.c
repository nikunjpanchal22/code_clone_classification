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


 
int main () 
{ 
    const char *s = "/products/product_code1233213/image.jpg"; 
    const char *endSubstring; 
    char *result; 
    size_t len; 
    char **slashes  = malloc(strlen(s) * sizeof(char*)); 
    int j = 0; 
  
    for (int i = 0; i < strlen(s); i++) { 
        if (s[i] == '/') 
            slashes[j++] = &s[i]; 
    } 
  
    endSubstring = slashes[j - 2] + 1; 
    len = strlen(s) - (endSubstring - s) - 1; 
    result = malloc (len + 1); 
    memcpy(result, endSubstring, len); 
    result[len] = '\0'; 
    printf("%s\n", result); 
    free(slashes); 
    free(result); 
    return 0; 
}


