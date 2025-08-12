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
    char *fileName, *p; 
    size_t len; 
    fileName = strdup(s); 
    if (fileName == NULL) { 
        return 0; 
    } 
    p = fileName; 
    for (p = fileName; *p; ++p) { 
        if (*p == '/') { 
            fileName = p + 1; 
        } 
    } 
    len = strlen(fileName); 
    printf ("%s\n", fileName); 
    free (fileName); 
    return 0; 
}


