int main (int argc, const char *argv []) {
    char sentence [] = "this is a sentence";
    size_t len = strlen (sentence);
    char *newSentence = malloc (len +1);
    char *ptr_src = sentence;
    char *ptr_dst = newSentence;
    while (ptr_src) {
        char *next, *t;
        next = strchr (ptr_src, ' ');
        if (!next)
            next = sentence + len;
        for (t = next; t > ptr_src;) {
            *ptr_dst++ = *--t;
        }
        if (*next) {
            *ptr_dst++ = *next++;
            ptr_src = next;
        }
        else {
            *ptr_dst = 0;
            break;
        }
    }
    printf ("[%s]", newSentence);
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main() {
    char sent[] = "this is a sentence";
    size_t length = strlen(sent);
    char *newSen = calloc(length + 1, sizeof(char));
    char *source = sent, *target = newSen;
    while (*source) {
        char *space, *temp;
        space = strchr(source, ' ');
        if (!space) { space = sent + length; }
        for (temp = space; temp > source;) { *target++ = *--temp; }
        if (*space) { *target++ = *space++; source = space; }
        else { *target = '\0'; break; }
    }
    printf("%s\n", newSen);
    free(newSen);
    return 0;
}


