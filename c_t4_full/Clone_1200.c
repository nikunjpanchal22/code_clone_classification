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

int cmp_func(const void * a, const void * b) {
		    const char * pinA = *(const char **)a;
		    const char * pinB = *(const char **)b;
		    return strcmp(pinA, pinB);
		}

		int main() {
		    const char *pins[] = {"d1", "d2", "d3", "d4", "d5", "o1", "o2", "o3", "o4"};
		    const int pinNumbers[] = {1, 2, 19, 4, 14, 6, 12, 15, 17};
		    const char *key = "d3";
		    const char ** res = bsearch(&key, pins, 9, sizeof(char *), cmp_func);

		    if(res) printf("%d\n", pinNumbers[res-pins]);
		    return 0;
}


