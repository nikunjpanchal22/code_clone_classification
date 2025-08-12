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
    const char s[] = "/products/product_code1233213/image.jpg"; 
    char *lastSlash; 
    char fileName[100]; 
    size_t len; 
    lastSlash = strrchr(s, '/'); 
    len = lastSlash - s - 1; 
    strncpy(fileName, s + 1, len); 
    fileName[len] = '\0'; 
    printf ("%s\n", fileName); 
    return 0; 
} 


