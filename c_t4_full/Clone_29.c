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
    const int bufSize = strlen(s); 
    char result[bufSize]; 
    int len; 
    int i; 
    int j = 0; 
  
    for(i = 0; i < bufSize; i++) { 
        if(s[i] == '/') { 
            j = 0; 
        } 
        else{ 
            result[j] = s[i]; 
            j++; 
        } 
    } 
    len = strlen(result); 
    printf ("%s\n", result); 
    return 0; 
} 


