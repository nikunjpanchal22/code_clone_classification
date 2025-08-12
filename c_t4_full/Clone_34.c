int main (void) {
    long long i;
    char text [] = "a;lskdddddddd;js;'";
    buf = malloc (1000000);
    strcat (buf, "a;lskdddddddd;js;dlkag;lkjsda;gkl;sdfja;klagj;aglkjaf;d");
    i = 1;
    while (strlen (buf) < i * 1000000) {
        strcat (buf, text);
        if (strlen (buf) > (i * 10000) - 10) {
            i++;
            buf = realloc (buf, 10000000 * i);
        }
    }
    return 0;
}


 int main (void) {
    char *buffer = NULL;
    long long size = 0;
    char string[] = "a;lskdddddddd;js;'";
   
    buffer = calloc(8, sizeof(char));
    if(buffer == NULL) return 0;   
   
    strncpy(buffer, string, 8);
    size += 8;
 
    while (strlen(buffer) < 1000000) {
        buffer = realloc(buffer, (strlen(buffer) + 100000)* sizeof(char));
        strcat(buffer, string);
        size += 100000;
    }
   
    return 0;
}


