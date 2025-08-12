int main (void) {
    char input [] = ".- -... -.-.";
    morse_table_t table [] = {{".-", "A"}, {"-...", "B"}, {"-.-.", "C"}};
    char *segment;
    int i;
    segment = strtok (input, " ");
    while (segment) {
        for (i = 0; i < ARRAY_SIZE (table); ++i) {
            if (!strcmp (segment, table[i].morse))
                puts (table[i].ascii);
        }
        segment = strtok (NULL, " ");
    }
    return 0;
}


 

#include <stdio.h>
#include <string.h>
#define ARRAY_SIZE(x) (sizeof(x) / sizeof((x)[0]))

typedef struct { char *morse; char *ascii; } morse_table_t;

char input[] = ".- -... -.-.";
morse_table_t table[] = { {".-", "A"}, {"-...", "B"}, {"-.-.", "C"} };

int main(void) {
	    char *segment;
	    int i;

	    segment = strtok(input, " ");
	    while (segment) {
		for (i = 0; i < ARRAY_SIZE(table); ++i) {
		    if (!strcmp(segment, table[i].morse))
		        puts(table[i].ascii);
		}
		segment = strtok(NULL, " ");
	    }
	    return 0;
}


