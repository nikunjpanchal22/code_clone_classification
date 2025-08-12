int main (void) {
    char line [MAXS] = {0};
    while (fgets (line, MAXS, stdin) != NULL) {
        char *p = line;
        size_t len = strlen (line);
        while (len > 0 && (line[len - 1] == '\n' || line[len - 1] == '\r'))
            line[--len] = 0;
        while (isspace (*p))
            p++;
        if (*p == '#' || *p == '@' || !*p)
            continue;
        printf ("%s\n", line);
    }
    return 0;
}





#include <stdio.h>
#include <ctype.h>
#include <string.h>
#define MAXS 256
main (){
    char line[MAXS] = {};
    for(;fgets(line, MAXS, stdin);) {
        char *p = line;
        while(*p == '\n' || *p == '\r' || !*p || *p == '#' || *p == '@') p++;
        if(p != line) continue;
        printf("%s", line);
    }
}


