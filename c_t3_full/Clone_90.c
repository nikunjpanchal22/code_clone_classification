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
    long long i;
    buf = malloc(1000000);
    char text[] = "a;lskdddddddd;js;'";
    strcat(buf, "a;lskdddddddd;js;dlkag;lkjsda;gkl;sdfja;klagj;aglkjaf;d");
    i = 1;
  
    while (strlen(buf) +strlen(text)< i * 1000000) {
        strcat (buf, text);
        buf = realloc(buf, 10000000 * i);
        i++;
    }
  return 0;
}


