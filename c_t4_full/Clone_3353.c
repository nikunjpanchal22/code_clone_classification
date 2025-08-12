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






#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main () {
    char *str = "krishna";
    int size = strlen(str);
    char *another, *temp;
    another = temp = (char *) malloc(size + 1);
    for (int i = 0; i < size + 1; i++) {
        *temp++ = *str++;
    }
    printf("%s", another);
    free(another);
    return 0;
}


