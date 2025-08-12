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




#include<stdio.h>
#define MAXS 100
main(){
    char line[MAXS], ch;
    int i = 0;
    while ((ch=getchar()) != EOF){
        if(ch == '#' || ch == '@' || ch == '\n'){
            line[i] = '\0';
            printf("%s\n", line);
            i = 0;
            continue;
        }
        line[i++] = ch;
    }
}


