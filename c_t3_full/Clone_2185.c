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
#define SPACE ' '
int main() {
    char s[] = "this is a sentence";
    size_t l = strlen(s);
    char *newS = malloc(l + 1);
    char *src = s, *trg = newS;
    while (*src) {
        char *next_space, *tmp;
        next_space = strchr(src, SPACE);
        if (!next_space) { next_space = s + l; }
        for (tmp = next_space; tmp > src;) { *trg++ = *--tmp; }
        if (*next_space) { *trg++ = *next_space++; src = next_space; }
        else { *trg = '\0'; break; }
    }
    printf("%s\n", newS);
    free(newS);
    return 0;
}


