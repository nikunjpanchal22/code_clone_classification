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
#include <stdlib.h>
#include <string.h>

int cmp(const void *a, const void *b) {
		    return strcmp(*(const char**)a, *(const char**)b);
		}

		int main() {
		    const char *pins[] = {"d1", "d2", "d3", "d4", "d5", "o1", "o2", "o3", "o4"};
		    const int pinNumbers[] = {1, 2, 19, 4, 14, 6, 12, 15, 17};
		    const char *key = "d3";
		    char **found = (char**)bsearch(&key, pins, 9, sizeof(char*), cmp);
		    if(found)
			printf("%d\n", pinNumbers[found - pins]);
		    return 0;
}


