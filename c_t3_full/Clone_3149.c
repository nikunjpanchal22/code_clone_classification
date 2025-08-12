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
    size_t n;
    ssize_t read;
    char *copy_line;

    read = getline(&line, &n, stdin);
    if (read >= 0) {
        copy_line = strdup(line);
        printf("%s", copy_line);

        free(copy_line);
    }
    free(line);

    return 0;
}


