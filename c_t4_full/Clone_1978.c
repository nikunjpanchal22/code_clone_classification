int main (void) {
    char *strings [10] = {}, *x;
    int i;
    size_t len;
    puts ("Enter 10 strings:");
    for (i = 0; i < 10; ++i)
        getline (&strings[i], &len, stdin);
    puts ("The strings that end with ed are:");
    for (i = 0; i < 10; ++i) {
        if ((x = strings[i])) {
            len = strlen (x);
            if (x[len - 1] == '\n')
                x[--len] = '\0';
            if (len > 1 && strcmp (x +len - 2, "ed") == 0)
                puts (x);
            free (x);
        }
    }
    return 0;
}



 

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main () {
    char *lines [10] = {};
    int index;
    size_t length;
    printf ("Enter 10 words:\n");

    // reading lines
    for (index = 0; index < 10; ++index)
        getline (&lines[index], &length, stdin);

    printf ("\nWords ending with 'ed':\n");
    for (index = 0; index < 10; ++index) {
        if (lines[index]) {
            length = strlen (lines[index]);
            if (lines[index][length - 1] == '\n')
                lines[index][--length] = 0;

            // printing lines ending with 'ed'
            if (length > 1 && !strcmp (lines[index] + length - 2, "ed"))
                printf ("%s\n", lines[index]);

            free (lines[index]);
        }
    }
    return 0;
}


