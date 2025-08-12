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
#include <string.h>

void modify(char *str);

int main() {
	    char *str = strdup("Hello World");

	    modify(str);

	    printf("%s\n", str);
	    return 0;
	}

	void modify(char *str) {
	    for (int i = 0; str[i]; i++)
		if (i == 6)
		    str[i] = '\0';
}


