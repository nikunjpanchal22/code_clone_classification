int main (void) {
    char *line = NULL;
    size_t count;
    char *dup_line;
    getline (& line, & count, stdin);
    dup_line = strdup (line);
    puts (dup_line);
    free (dup_line);
    free (line);
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char *line = NULL;
    size_t len = 0;
    ssize_t read;
    char *duplt_line;

    if ((read = getline(&line, &len, stdin)) != -1) {
        duplt_line = strdup(line);
        printf("%s", duplt_line);
        free(duplt_line);
    }

    free(line);

    return 0;
}


