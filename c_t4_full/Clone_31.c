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
    int flag = 0; 
    char fileName[100]; 
    size_t len; 
    for(int i = 0; i<strlen(s); i++) { 
        fileName[i] = s[i]; 
        if(s[i] == '/') { 
            flag++; 
            if(flag == 2){ 
                fileName[i]='\0'; 
            } 
        } 
    } 
    len = strlen(fileName); 
    printf ("%s\n", fileName); 
    return 0; 
} 


