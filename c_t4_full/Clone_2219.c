int main (void) {
    FILE *data = NULL;
    size_t nlines = 0;
    char a [MAXC] = "";
    printf ("Enter a filename: ");
    if (fscanf (stdin, " %1023[^\n]", a) != 1) {
        fputs ("user canceled input.\n", stderr);
        return 1;
    }
    if ((data = fopen (a, "r")) == NULL) {
        perror ("fopen-a");
        return 1;
    }
    printf ("file opened: %s\n\n", a);
    while (fgets (a, MAXC, data) != NULL)
        printf ("line[%3zu]: %s", nlines +++1, a);
    fclose (data);
    return 0;
}



#include <stdio.h>
#define MAXC 1024

int main (void) {
    FILE *data = NULL;
    int count = 0;
    char string[1024];
    printf("Enter a filename: ");
    fscanf(stdin, "%1023s", string);
    if ((data = fopen(string,"r")) == NULL) {
        printf("Cannot open file %s\n", string);
        return 1;
    }
    char line[MAXC];
    while(fgets(line, sizeof line, data)){
        printf("line[%3d]: %s", count++, line);
    }
    fclose(data);
    return 0;
}


