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
 
#define SIZE 1000
 
int main () {
    char **s;
    s = malloc(SIZE * sizeof (char *));
    char temp[SIZE];
    int i = 0;
    while (fgets(temp, SIZE, stdin)) {
        s[i++] = strdup(temp);
    }
    return 0;
}


