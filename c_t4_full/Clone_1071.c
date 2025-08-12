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



 

#include <stdlib.h>
#include <string.h>

int main() {
    long long i;
    const char* text = "Computer Science";
    char* buf = (char*)malloc(sizeof(char) * 1000000);
    strcpy(buf, text);
    i = 1;
    while (strlen(buf) < (i * 1000000)) {
        strcat(buf, text);
        if (strlen(buf) > ((i * 10000) - 10)) {
            i++;
            buf = realloc(buf, sizeof(char) * (10000000 * i));
        }
    }
    free(buf);
    return 0;
}


