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
#include <string.h>
#include <stdlib.h>
 
int main () {
    char **s = (char **) calloc(1000, sizeof(char *));
    char temp[1000];
    int i = 0;
    while (fgets(temp, 1000, stdin) != NULL) {
        s[i++] = strdup(temp);
    }
    return 0;
}


