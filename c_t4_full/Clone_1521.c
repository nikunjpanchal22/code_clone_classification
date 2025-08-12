int main (void) {
    char *line1 = NULL, *line2 = NULL;
    size_t size1 = 0, size2 = 0;
    getline (& line1, & size1, stdin);
    getline (& line2, & size2, stdin);
    size_t len1, len2;
    char **array1 = split (line1, " \t\n", &len1);
    char **array2 = split (line2, " \t\n", &len2);
    qsort (array1, len1, sizeof (* array1), cmp);
    qsort (array2, len2, sizeof (* array2), cmp);
    find_diff (array1, array2);
    drop (array1);
    drop (array2);
    free (line1);
    free (line2);
    return 0;
}




#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char **split(char *, char *, size_t *);
int cmp(const void *, const void *);
void find_diff(char **, char **);
void drop(char **);

int main (void) {
    char *lines[2] = {NULL, NULL};
    size_t sizes[2] = {0, 0};
    for (int i=0; i<2; i++)
        getline (&lines[i], &sizes[i], stdin);
    size_t lens[2];
    char **arr[2];
    for (int i=0; i<2; i++)
        arr[i] = split(lines[i], " \t\n", &lens[i]);
    for(int i=0; i<2; i++)
        qsort(arr[i], lens[i], sizeof (*arr[i]), cmp);
    find_diff (arr[0], arr[1]);
    for(int i=0; i<2; i++)
        drop (arr[i]);
    for(int i=0; i<2; i++)
        free(lines[i]);
    return 0;
}


