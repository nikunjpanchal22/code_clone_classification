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
#define MAXS 256
int main(int argc, char *argv[]){
    char buff[MAXS];
    while(fgets(buff,sizeof buff,stdin)){
        char *ptr=strpbrk(buff,"#\r\n@");
        if(ptr)
            *ptr='\0';
        printf("%s\n",buff);
    }
    return 0;
}


