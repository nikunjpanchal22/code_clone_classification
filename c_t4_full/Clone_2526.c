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

int main() {
    const int MAX = 1000;
    char **s = malloc(MAX * sizeof(char *));
    char temp[MAX];
    int i = 0;
    while(fscanf(stdin, "%s", temp) != EOF) {
        s[i++] = strdup(temp);
    }
    return 0;
}


