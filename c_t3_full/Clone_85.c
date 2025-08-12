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
    const char *begin = s, *end = s; 
    char *result, filenam[100]; 
    size_t len; 
    while (*s) { 
        if (*s == '/') { 
            begin = end; 
            end = s; 
        } 
        s++; 
    } 
  
    if (begin != end) { 
        len = end - begin - 1; 
        memcpy (filenam, begin + 1, len); 
        filenam[len] = '\0'; 
        printf ("%s\n", filenam); 
    } 
    return 0; 
} 


