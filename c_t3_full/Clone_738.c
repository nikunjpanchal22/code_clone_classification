int main (void) {
    char str1 [] = "Japan Korea Spain Germany Australia France ";
    char str2 [] = "England USA Russia Italy Australia India Nepal France";
    char *tar = strtok (str1, " ");
    char *ptr;
    size_t sz;
    while (tar) {
        if ((ptr = strstr (str2, tar)) != NULL) {
            if ((ptr == str2) || (*(ptr - 1) == ' ')) {
                sz = strlen (tar);
                if ((*(ptr + sz) == ' ') || (*(ptr + sz) == '\0')) {
                    puts (tar);
                }
            }
        }
        tar = strtok (NULL, " ");
    }
    return 0;
}



int main(void) 
{ 
    const char str1[] = "Japan Korea Spain Germany Australia France ";
    const char str2[] = "England USA Russia Italy Australia India Nepal France";
    char *tar = strtok(str1, " ");
    char *ptr;
    size_t sz;
    while (tar != NULL) 
    { 
        if ((ptr = strstr(str2, tar)) != NULL) 
        { 
            if ((ptr == str2) || (*(ptr-1) == ' ')) 
            { 
                sz = strlen(tar); 
                if (*(ptr+sz) == ' ' || *(ptr+sz) == '\0') 
                    fprintf(stdout, "%s\n", tar); 
            } 
        } 
        tar = strtok(NULL, " "); 
    } 
  
    return 0;
}


