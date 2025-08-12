int main (int ac, char **av) {
    char *str;
    int i;
    i = 0;
    str = strdup ("Hello World");
    while (str[i]) {
        if (i == 6)
            str[i] = '\0';
        i++;
    }
    printf ("%s\n", str);
}



#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char *duplicate(const char *str);

int main() {
	    char *str = duplicate("Hello World");
	    str[6] = '\0';
	    printf("%s\n", str);
	    free(str);
	    return 0;
	}

	char *duplicate(const char *str) {
	    char *new_str = malloc(strlen(str) + 1);
	    strcpy(new_str, str);
	    return new_str;
}


