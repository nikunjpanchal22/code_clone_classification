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

int cmp(const void* a, const void* b) {
		    return strcmp(*(char**)a, *(char**)b);
		}

		int main() {
		    const char * pins[] = {"d1", "d2", "d3", "d4", "d5", "o1", "o2", "o3", "o4"};
		    const int pinsNumbers[] = {1, 2, 19, 4, 14, 6, 12, 15, 17};
		    const char * key = "d3";
		    char ** res = (char**)bsearch(&key, pins, 9, sizeof(char*), cmp);
		    
		    if(res)
			printf("%d\n", pinsNumbers[res - pins]);
		    return 0;
}


