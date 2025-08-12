int main () {
    char *p = "krishna";
    int size = strlen (p) + 1;
    char *q = (char *) malloc (size);
    char *qi = q;
    do {
        *q++ = *p;
    }
    while (*p++ != '\0');
    q = qi;
    printf ("%s", q);
    getch ();
    return 0;
}






#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(){
    char *str = "krishna", *copy;
    copy = calloc(strlen(str) + 1, sizeof(char));
    memcpy(copy, str, strlen(str));
    printf("%s", copy);
    free(copy);
    return 0;
}


