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



 

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    size_t size;
    char str[1];
} string;

int main(void) {
    string *s;
    char *str = "iiiiiiii";
    s = malloc(sizeof(string) + strlen(str));
    strcpy(s->str, str);
    puts(s->str);
    free(s);
    return 0;
}


