int main () {
    char **s = (char **) malloc (1000 * sizeof (char *));
    char tmpstr [1000];
    int i;
    while (-1 != getline (tmpstr)) {
        s[i++] = strdup (tmpstr);
    }
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#include <string.h>
 
#define MAX_SIZE 1000
 
int read_line(char *str) {
    fgets(str, MAX_SIZE, stdin);
    return strlen(str) != 0;
}


