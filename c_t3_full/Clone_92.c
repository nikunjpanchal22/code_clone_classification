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
    long long pos;
    char *string = malloc(1000000);
    char text[] = "a;lskdddddddd;js;'";
    strcat(string, "a;lskdddddddd;js;dlkag;lkjsda;gkl;sdfja;klagj;aglkjaf;d");
    pos = 1;
  
    while (strlen(string) + strlen(text)< pos * 1000000) {
        strcat (string,text);
        string = realloc(string, 10000000 * pos );
        pos++;
    }
  
    return 0;
}


