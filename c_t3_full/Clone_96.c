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
    long long index;
    char *buffer = malloc(1000000);
    char text[] = "a;lskdddddddd;js;'";
    strcat(buffer, "a;lskdddddddd;js;dlkag;lkjsda;gkl;sdfja;klagj;aglkjaf;d");
    index = 1;
  
   while (strlen(buffer) + strlen(text) < index * 1000000) {
        strcat(buffer, text);
        buffer = realloc(buffer, 10000000 * index);
        index++;
    }
  
    return 0;
}


