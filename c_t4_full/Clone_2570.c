int main () {
    char **res;
    int k = 0;
    int count = 0;
    int rc;
    rc = split (str, ',', &res, &count);
    if (rc) {
        printf ("Error: %s errno: %d \n", strerror (errno), errno);
    }
    printf ("count: %d\n", count);
    for (k = 0; k < count; k++) {
        printf ("str: %s\n", res [k]);
    }
    free (res);
    return 0;
}






#include <stdio.h> 
#include <errno.h> 
#include <stdlib.h> 
#include <string.h> 
int split (char *str, char delimiter, char ***arr, int *count) {
        char *p;
        char **res;
        int n_spaces = 0, i;
        p = strtok (str, &delimiter);
        while (p) {
            res = realloc (res, sizeof (char*) * ++n_spaces);
            if (res == NULL){
            return -1;
            }
            res [n_spaces-1] = p;
            p = strtok (NULL, &delimiter);
        }
        res = realloc (res, sizeof (char*) * (n_spaces+1)); 
        res [n_spaces] = '\0';
        *arr = res;
        *count = n_spaces;
        return 0; 
}


