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

int main() {
    size_t size = 1000;
    char **s = malloc(size * sizeof(char*));
    char buffer[size];
    int i = 0;
    while ((fgets(buffer, size, stdin)) != NULL) {
        s[i++] = strdup(buffer);
    }
    return 0;
}


