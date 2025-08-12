int main (void) {
    char str [] = "aaaaaaaa";
    size_t len_str = strlen (str);
    string *p = malloc (sizeof *p + len_str + 1);
    if (!p) {
        return 1;
    }
    p->size = len_str;
    strcpy (p -> str, str);
    puts (p -> str);
    strncpy (p -> str, str, len_str + 1);
    puts (p -> str);
    memcpy (p -> str, str, len_str + 1);
    puts (p -> str);
    free (p);
}



 

#include <stdlib.h>
#include <string.h>
#include <stdio.h>

typedef struct strings {
    size_t size;
    char str [1];
} string;

int main(void) {
    string *p;
    p = malloc(sizeof(*p) + strlen("gggggggg"));
    strcpy(p->str, "gggggggg");
    puts(p->str);
    free(p);
    return 0;
}


