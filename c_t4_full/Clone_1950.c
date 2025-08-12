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

int main() {
    for(int i = 0; i < 6; i++) {
        printf("%c", "Hello World"[i]);
    }

    printf("\n");
    return 0;
}


