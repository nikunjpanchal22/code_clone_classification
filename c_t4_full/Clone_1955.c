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

void print_hello();

int main() {
	    print_hello();
	    return 0;
	}

	void print_hello() {
	    char *str = "Hello World";
	    str[6] = '\0';
	    printf("%s\n", str);
}


