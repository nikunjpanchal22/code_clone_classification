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
#include <string.h>
#include <ctype.h>
#define MAXS 100
int main(){
    char line[MAXS] = {0};
    while(fgets(line, MAXS, stdin)){
        size_t len = strcspn(line, "@#\n\r");
        line[len] = '\0';
        if(len>0)
            printf("%s\n", line);
    }
    return 0;
}


