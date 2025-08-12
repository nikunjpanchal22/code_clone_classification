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

void print_ascii(char *segment, morse_table_t *table) {
	    for (int i = 0; i < ARRAY_SIZE(table); ++i) {
		if (!strcmp(segment, table[i].morse))
		    puts(table[i].ascii);
	    }
	}

	void parse_morse(char *input, morse_table_t *table) {
	    char *segment = strtok(input, " ");
	    while (segment) {
		print_ascii(segment, table);
		segment = strtok(NULL, " ");
	    }
	}

	int main(void) {
	    char input[] = ".- -... -.-.";
	    morse_table_t table[] = { {".-", "A"}, {"-...", "B"}, {"-.-.", "C"} };

	    parse_morse(input, table);

	    return 0;
}


