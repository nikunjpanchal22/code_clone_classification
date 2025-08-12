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
    const char *p; 
    char seek[2] = {'/','\0'}, *Msg, result[100]; 
    int len,tail; 
    p = s; 
    while(p != NULL) { 
        Msg = strstr(p,seek); 
        if(Msg) { 
            strncpy(result, Msg + 1, strlen(Msg) - 1); 
            tail = Msg - p; 
            strncpy(result, p, tail); 
            p = Msg + 1; 
        } 
        else { 
            break; 
        } 
    } 
    len = strlen(result); 
    printf ("%s\n", result); 
    return 0; 
}


