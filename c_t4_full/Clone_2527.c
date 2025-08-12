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
 
int main () {
    char **s = malloc(1000 * sizeof(char *));
    char temp_str[1000];
    int i = 0;
    for(;fgets(temp_str, sizeof(temp_str), stdin) != NULL; i++) {
        s[i] = strdup(temp_str);
    }
    return 0;
}


