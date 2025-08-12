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
    const char* text = "New string";
    char* buffer = (char*)malloc(sizeof(char) * 1000000);
    strcpy(buffer, text);
    i = 1;
    while (strlen(buffer) < (i * 1000000)) {
        strcat(buffer, text);
        if (strlen(buffer) > ((i * 10000) - 10)) {
            i++;
            buffer = realloc(buffer, sizeof(char) * (10000000 * i));
        }
    }
    return 0;
}


