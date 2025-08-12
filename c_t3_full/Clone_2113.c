int main (void) {
    const char *pins [] = {"d1", "d2", "d3", "d4", "d5", "o1", "o2", "o3", "o4"};
    const int pinsNumbers [] = {1, 2, 19, 4, 14, 6, 12, 15, 17};
    const char *key = "d3";
    const char **p = bsearch (&key, pins, sizeof (pins) / sizeof (*pins), sizeof (const char *), cmp);
    if (p)
        printf ("%d\n", pinsNumbers[p - pins]);
    return 0;
}



 

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int cmp(const void *a, const void *b) {
		    return strcmp(*(const char**)a, *(const char**)b);
		}
		int main(void) {
		    const char *array[] = {"d1", "d2", "d3", "d4", "d5", "o1", "o2", "o3", "o4"};
		    int values[] = {1, 2, 19, 4, 14, 6, 12, 15, 17};
		    const char* key = "d3";
		    int count = sizeof(array) / sizeof(char *);
		    const char** found = bsearch(&key, array, count, sizeof(char *), cmp);
		    int index = (int)(found - array);
		    if(found) printf("%d\n", values[index]);
		    return 0;
}


