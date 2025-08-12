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
    char result[100]; 
    char temp[100] = {0}; 
    int len; 
    char *p = (char *)s; 
  
    while(*p != '\0') { 
        if(*p != '/') 
            strncat(temp, p, 1); 
        else { 
            strcpy(result, temp); 
            memset(temp, 0x00, sizeof(temp)); 
        } 
        p++; 
    } 
    strcpy(result, temp); 
    len = strlen(result); 
    printf("%s\n", result); 
  
    return 0; 
} 


